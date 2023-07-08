CREATE TABLE usuarios (
  deletado BOOLEAN DEFAULT false,
  criado_em DATE,
  atualizado_em DATE,
  nome VARCHAR(255) NOT NULL,
  nome_usuario VARCHAR(255) NOT NULL,
  telefone VARCHAR(20),
  email VARCHAR(255),
  senha VARCHAR(255),
  link_perfil VARCHAR(255)
);


CREATE TABLE posts (
  deletado BOOLEAN DEFAULT false,
  criado_em DATE,
  atualizado_em DATE,
  titulo VARCHAR(50) NOT NULL,
  descricao VARCHAR(200),
  link_foto VARCHAR(255),
  link_video VARCHAR(255),
  privado BOOLEAN DEFAULT false

);