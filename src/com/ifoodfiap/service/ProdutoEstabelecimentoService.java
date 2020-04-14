package com.ifoodfiap.service;

import java.util.ArrayList;
import java.util.List;

import com.ifoodfiap.domain.ProdutoEstabelecimento;
import com.ifoodfiap.vo.ProdutoSolicitadoVO;

public class ProdutoEstabelecimentoService {
	
	public List<ProdutoEstabelecimento> convertListToEntities(List<ProdutoSolicitadoVO> produtosVOs) {
		List<ProdutoEstabelecimento> produtos = new ArrayList<>();
		for(ProdutoSolicitadoVO produtoVO : produtosVOs) {
			produtos.add(create(produtoVO));
		}
		return produtos;
	}

	private ProdutoEstabelecimento create(ProdutoSolicitadoVO produtoVO) {
		ProdutoEstabelecimento produto = new ProdutoEstabelecimento();
		produto.setId(produtoVO.getCodigoProduto());
		produto.setNomeProduto(produtoVO.getNomeProduto());
		produto.setPreco(produtoVO.getPreco());
		produto.setQuantidade(null);
		return produto;
	}
}
