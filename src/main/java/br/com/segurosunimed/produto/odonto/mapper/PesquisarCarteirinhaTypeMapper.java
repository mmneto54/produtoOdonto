package br.com.segurosunimed.produto.odonto.mapper;

import br.com.segurosunimed.produto.odonto.dto.PesquisarCarteirinhaDTO;
import br.com.segurosunimed.produto.odonto.model.PesquisarCarteirinhaType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PesquisarCarteirinhaTypeMapper extends IEntityMapper<PesquisarCarteirinhaType, PesquisarCarteirinhaDTO>  {
}
