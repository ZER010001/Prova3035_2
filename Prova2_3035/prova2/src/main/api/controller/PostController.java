package prova3035.api.controller;

import jakarta.validation.Valid;
import prova3035.api.post.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostRepository repository;

    @PostMapping
    @Transactional
    public void postar(@RequestBody @Valid DadosPost dados) {
        repository.save(new Post(dados));
    }

    @GetMapping
    public Page<DadosListagemPost> listar(@PageableDefault(size = 10, sort = {"criado_em"}) Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemPost::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPost dados) {
        var post = repository.getReferenceById(dados.id());
        post.atualizarInformacoes(dados);
    }
//  VER COMO FAZER SEM O ID
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        var post = repository.getReferenceById(id);
        post.excluir();
    }


}
