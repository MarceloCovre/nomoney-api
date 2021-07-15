CREATE TABLE pessoa (
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    logradouro VARCHAR(30),
    complemento VARCHAR(20),
    numero VARCHAR(10),
    bairro VARCHAR(20),
    cep VARCHAR(10),
    cidade VARCHAR(20),
    estado VARCHAR(20),
    ativo BOOLEAN
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, logradouro, complemento, numero, bairro, cep, cidade, estado, ativo) values ('Alberto Correia', 'Rua 01', null,'53', 'Sao Pedro', '29980-653', 'Colatina', 'ES', true);
INSERT INTO pessoa (nome, logradouro, complemento, numero, bairro, cep, cidade, estado, ativo) values ('Jonas Gomes', 'Rua 11', null, '585', 'Centro', '29430-745', 'Linhares', 'ES', true);
INSERT INTO pessoa (nome, logradouro, complemento, numero, bairro, cep, cidade, estado, ativo) values ('Tiago Silva', 'Rua 48', null, '12', 'Centro', '29950-000', 'Cariacica', 'ES', true);
INSERT INTO pessoa (nome, logradouro, complemento, numero, bairro, cep, cidade, estado, ativo) values ('Maria Gonzales',  'Rua 15', null,'546', 'Centro', '29250-005', 'Salvador', 'BA', true);
INSERT INTO pessoa (nome, logradouro, complemento, numero, bairro, cep, cidade, estado, ativo) values ('Marcos Rodrigues', 'Rua 45', null, '56', 'Centro', '29362-000', 'Ouro preto', 'MG', true);


