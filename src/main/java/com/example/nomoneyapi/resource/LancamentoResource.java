package com.example.nomoneyapi.resource;

import com.example.nomoneyapi.event.RecursoCriadoEvent;
import com.example.nomoneyapi.model.Lancamento;
import com.example.nomoneyapi.repository.LancamentoRepository;
import com.example.nomoneyapi.repository.filter.LancamentoFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

    @RestController
    @RequestMapping("/lancamentos")
    public class LancamentoResource {

        @Autowired
        private LancamentoRepository lancamentoRepository;

        @Autowired
        private ApplicationEventPublisher publisher;

//        @GetMapping
//        public List<Lancamento> pesquisar(LancamentoFilter lancamentoFilter) {
//            return lancamentoRepository.filtrar(lancamentoFilter);
//        }

        @GetMapping
        public Page<Lancamento> pesquisar(LancamentoFilter lancamentoFilter, Pageable pageable) {
            return lancamentoRepository.filtrar(lancamentoFilter, pageable);
        }

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public ResponseEntity<Lancamento> criar(@Valid @RequestBody Lancamento lancamento, HttpServletResponse response){
            Lancamento lancamentoSalvo = lancamentoRepository.save(lancamento);

            publisher.publishEvent(new RecursoCriadoEvent(this, response, lancamentoSalvo.getCodigo()));

            return ResponseEntity.status(HttpStatus.CREATED).body(lancamentoSalvo);
        }

        @GetMapping("/{codigo}")
        public ResponseEntity<Lancamento> buscarPeloCodigo(@PathVariable Long codigo) {
            Lancamento lancamento = lancamentoRepository.findByCodigo(codigo);

            if (Objects.isNull(lancamento)){
                return ResponseEntity.notFound().build();
            }

            return ResponseEntity.ok().body(lancamento);
        }

        @DeleteMapping("/{codigo}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public void remover(@PathVariable Long codigo){
            lancamentoRepository.deleteById(codigo);
        }

}
