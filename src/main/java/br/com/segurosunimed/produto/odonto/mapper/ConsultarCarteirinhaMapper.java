package br.com.segurosunimed.produto.odonto.mapper;

import br.com.segurosunimed.produto.odonto.dto.ConsultarCarteirinhaDTO;
import br.com.segurosunimed.produto.odonto.model.ConsultarCarteirinhaType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConsultarCarteirinhaMapper extends IEntityMapper<ConsultarCarteirinhaType, ConsultarCarteirinhaDTO> {
}
