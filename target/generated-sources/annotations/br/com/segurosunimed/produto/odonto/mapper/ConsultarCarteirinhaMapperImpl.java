package br.com.segurosunimed.produto.odonto.mapper;

import br.com.segurosunimed.produto.odonto.dto.ConsultarCarteirinhaDTO;
import br.com.segurosunimed.produto.odonto.dto.ConsultarCarteirinhaResultadoDTO;
import br.com.segurosunimed.produto.odonto.dto.DadosBeneficiarioDTO;
import br.com.segurosunimed.produto.odonto.dto.DadosDependenteDTO;
import br.com.segurosunimed.produto.odonto.dto.DadosInfoComplementarDTO;
import br.com.segurosunimed.produto.odonto.dto.DadosPlanoDTO;
import br.com.segurosunimed.produto.odonto.dto.EnumTipoBeneficiarioDTO;
import br.com.segurosunimed.produto.odonto.dto.ListaDadosDependenteDTO;
import br.com.segurosunimed.produto.odonto.dto.ListaDadosPlanoDTO;
import br.com.segurosunimed.produto.odonto.dto.StatusMensagemDTO;
import br.com.segurosunimed.produto.odonto.dto.StatusMensagensDTO;
import br.com.segurosunimed.produto.odonto.model.ConsultarCarteirinhaResultado;
import br.com.segurosunimed.produto.odonto.model.ConsultarCarteirinhaType;
import br.com.segurosunimed.produto.odonto.model.DadosBeneficiario;
import br.com.segurosunimed.produto.odonto.model.DadosBeneficiario.CategoriaTipoContratoEnum;
import br.com.segurosunimed.produto.odonto.model.DadosDependente;
import br.com.segurosunimed.produto.odonto.model.DadosInfoComplementar;
import br.com.segurosunimed.produto.odonto.model.DadosPlano;
import br.com.segurosunimed.produto.odonto.model.EnumTipoBeneficiarioType;
import br.com.segurosunimed.produto.odonto.model.ListaDadosDependente;
import br.com.segurosunimed.produto.odonto.model.ListaDadosPlano;
import br.com.segurosunimed.produto.odonto.model.StatusMensagem;
import br.com.segurosunimed.produto.odonto.model.StatusMensagensType;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-28T10:39:50-0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
@Component
public class ConsultarCarteirinhaMapperImpl implements ConsultarCarteirinhaMapper {

    @Override
    public ConsultarCarteirinhaType toDto(ConsultarCarteirinhaDTO e) {
        if ( e == null ) {
            return null;
        }

        ConsultarCarteirinhaType consultarCarteirinhaType = new ConsultarCarteirinhaType();

        consultarCarteirinhaType.setCodigo( e.getCodigo() );
        consultarCarteirinhaType.setDescricao( e.getDescricao() );
        consultarCarteirinhaType.setDetalhe( e.getDetalhe() );
        consultarCarteirinhaType.setMensagens( statusMensagensDTOToStatusMensagensType( e.getMensagens() ) );
        consultarCarteirinhaType.setResultado( consultarCarteirinhaResultadoDTOToConsultarCarteirinhaResultado( e.getResultado() ) );

        return consultarCarteirinhaType;
    }

    @Override
    public ConsultarCarteirinhaDTO toEntity(ConsultarCarteirinhaType d) {
        if ( d == null ) {
            return null;
        }

        ConsultarCarteirinhaDTO consultarCarteirinhaDTO = new ConsultarCarteirinhaDTO();

        consultarCarteirinhaDTO.setCodigo( d.getCodigo() );
        consultarCarteirinhaDTO.setDescricao( d.getDescricao() );
        consultarCarteirinhaDTO.setDetalhe( d.getDetalhe() );
        consultarCarteirinhaDTO.setMensagens( statusMensagensTypeToStatusMensagensDTO( d.getMensagens() ) );
        consultarCarteirinhaDTO.setResultado( consultarCarteirinhaResultadoToConsultarCarteirinhaResultadoDTO( d.getResultado() ) );

        return consultarCarteirinhaDTO;
    }

    @Override
    public List<ConsultarCarteirinhaType> toDto(List<ConsultarCarteirinhaDTO> eList) {
        if ( eList == null ) {
            return null;
        }

        List<ConsultarCarteirinhaType> list = new ArrayList<ConsultarCarteirinhaType>( eList.size() );
        for ( ConsultarCarteirinhaDTO consultarCarteirinhaDTO : eList ) {
            list.add( toDto( consultarCarteirinhaDTO ) );
        }

        return list;
    }

    @Override
    public List<ConsultarCarteirinhaDTO> toEntity(List<ConsultarCarteirinhaType> dList) {
        if ( dList == null ) {
            return null;
        }

        List<ConsultarCarteirinhaDTO> list = new ArrayList<ConsultarCarteirinhaDTO>( dList.size() );
        for ( ConsultarCarteirinhaType consultarCarteirinhaType : dList ) {
            list.add( toEntity( consultarCarteirinhaType ) );
        }

        return list;
    }

    protected StatusMensagem statusMensagemDTOToStatusMensagem(StatusMensagemDTO statusMensagemDTO) {
        if ( statusMensagemDTO == null ) {
            return null;
        }

        StatusMensagem statusMensagem = new StatusMensagem();

        statusMensagem.setDescricao( statusMensagemDTO.getDescricao() );
        statusMensagem.setDetalhe( statusMensagemDTO.getDetalhe() );

        return statusMensagem;
    }

    protected List<StatusMensagem> statusMensagemDTOListToStatusMensagemList(List<StatusMensagemDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<StatusMensagem> list1 = new ArrayList<StatusMensagem>( list.size() );
        for ( StatusMensagemDTO statusMensagemDTO : list ) {
            list1.add( statusMensagemDTOToStatusMensagem( statusMensagemDTO ) );
        }

        return list1;
    }

    protected StatusMensagensType statusMensagensDTOToStatusMensagensType(StatusMensagensDTO statusMensagensDTO) {
        if ( statusMensagensDTO == null ) {
            return null;
        }

        StatusMensagensType statusMensagensType = new StatusMensagensType();

        statusMensagensType.setMensagem( statusMensagemDTOListToStatusMensagemList( statusMensagensDTO.getMensagem() ) );

        return statusMensagensType;
    }

    protected CategoriaTipoContratoEnum categoriaTipoContratoEnumToCategoriaTipoContratoEnum(br.com.segurosunimed.produto.odonto.dto.DadosBeneficiarioDTO.CategoriaTipoContratoEnum categoriaTipoContratoEnum) {
        if ( categoriaTipoContratoEnum == null ) {
            return null;
        }

        CategoriaTipoContratoEnum categoriaTipoContratoEnum1;

        switch ( categoriaTipoContratoEnum ) {
            case Adesao: categoriaTipoContratoEnum1 = CategoriaTipoContratoEnum.Adesao;
            break;
            case Empresarial: categoriaTipoContratoEnum1 = CategoriaTipoContratoEnum.Empresarial;
            break;
            case Individual: categoriaTipoContratoEnum1 = CategoriaTipoContratoEnum.Individual;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + categoriaTipoContratoEnum );
        }

        return categoriaTipoContratoEnum1;
    }

    protected DadosPlano dadosPlanoDTOToDadosPlano(DadosPlanoDTO dadosPlanoDTO) {
        if ( dadosPlanoDTO == null ) {
            return null;
        }

        DadosPlano dadosPlano = new DadosPlano();

        dadosPlano.setCodigo( dadosPlanoDTO.getCodigo() );
        dadosPlano.setNome( dadosPlanoDTO.getNome() );
        dadosPlano.setCodigoRegistroAns( dadosPlanoDTO.getCodigoRegistroAns() );
        dadosPlano.setAbrangencia( dadosPlanoDTO.getAbrangencia() );
        dadosPlano.setNomeProduto( dadosPlanoDTO.getNomeProduto() );
        dadosPlano.setDescricaoRegulamentacao( dadosPlanoDTO.getDescricaoRegulamentacao() );
        dadosPlano.setTipoAcomodacao( dadosPlanoDTO.getTipoAcomodacao() );
        dadosPlano.setSegmentacaoAssistencial( dadosPlanoDTO.getSegmentacaoAssistencial() );
        dadosPlano.setTipoContratacao( dadosPlanoDTO.getTipoContratacao() );
        dadosPlano.setDataInicio( dadosPlanoDTO.getDataInicio() );
        dadosPlano.setValidadeCarteirinha( dadosPlanoDTO.getValidadeCarteirinha() );
        dadosPlano.setViaCarteirinha( dadosPlanoDTO.getViaCarteirinha() );
        dadosPlano.setDataCpt( dadosPlanoDTO.getDataCpt() );
        dadosPlano.setDataCarenciaUrgenciaEmergencia( dadosPlanoDTO.getDataCarenciaUrgenciaEmergencia() );
        dadosPlano.setDataCarenciaConsultaExameBasico( dadosPlanoDTO.getDataCarenciaConsultaExameBasico() );
        dadosPlano.setDataCarenciaTerapiaExamesEspeciais( dadosPlanoDTO.getDataCarenciaTerapiaExamesEspeciais() );

        return dadosPlano;
    }

    protected List<DadosPlano> dadosPlanoDTOListToDadosPlanoList(List<DadosPlanoDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<DadosPlano> list1 = new ArrayList<DadosPlano>( list.size() );
        for ( DadosPlanoDTO dadosPlanoDTO : list ) {
            list1.add( dadosPlanoDTOToDadosPlano( dadosPlanoDTO ) );
        }

        return list1;
    }

    protected ListaDadosPlano listaDadosPlanoDTOToListaDadosPlano(ListaDadosPlanoDTO listaDadosPlanoDTO) {
        if ( listaDadosPlanoDTO == null ) {
            return null;
        }

        ListaDadosPlano listaDadosPlano = new ListaDadosPlano();

        listaDadosPlano.setPlano( dadosPlanoDTOListToDadosPlanoList( listaDadosPlanoDTO.getPlano() ) );

        return listaDadosPlano;
    }

    protected DadosInfoComplementar dadosInfoComplementarDTOToDadosInfoComplementar(DadosInfoComplementarDTO dadosInfoComplementarDTO) {
        if ( dadosInfoComplementarDTO == null ) {
            return null;
        }

        DadosInfoComplementar dadosInfoComplementar = new DadosInfoComplementar();

        dadosInfoComplementar.setCodigoRegistroOperadora( dadosInfoComplementarDTO.getCodigoRegistroOperadora() );
        dadosInfoComplementar.setNomeOperadora( dadosInfoComplementarDTO.getNomeOperadora() );
        dadosInfoComplementar.setNumeroSac( dadosInfoComplementarDTO.getNumeroSac() );
        dadosInfoComplementar.setNumeroAns( dadosInfoComplementarDTO.getNumeroAns() );
        dadosInfoComplementar.setSiteAns( dadosInfoComplementarDTO.getSiteAns() );

        return dadosInfoComplementar;
    }

    protected DadosDependente dadosDependenteDTOToDadosDependente(DadosDependenteDTO dadosDependenteDTO) {
        if ( dadosDependenteDTO == null ) {
            return null;
        }

        DadosDependente dadosDependente = new DadosDependente();

        dadosDependente.setNome( dadosDependenteDTO.getNome() );
        dadosDependente.setDataNascimento( dadosDependenteDTO.getDataNascimento() );
        dadosDependente.setListaPlano( listaDadosPlanoDTOToListaDadosPlano( dadosDependenteDTO.getListaPlano() ) );
        dadosDependente.setInfoComplementar( dadosInfoComplementarDTOToDadosInfoComplementar( dadosDependenteDTO.getInfoComplementar() ) );
        dadosDependente.setNumero( dadosDependenteDTO.getNumero() );
        dadosDependente.setNumeroCNS( dadosDependenteDTO.getNumeroCNS() );
        dadosDependente.setSituacao( dadosDependenteDTO.getSituacao() );

        return dadosDependente;
    }

    protected List<DadosDependente> dadosDependenteDTOListToDadosDependenteList(List<DadosDependenteDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<DadosDependente> list1 = new ArrayList<DadosDependente>( list.size() );
        for ( DadosDependenteDTO dadosDependenteDTO : list ) {
            list1.add( dadosDependenteDTOToDadosDependente( dadosDependenteDTO ) );
        }

        return list1;
    }

    protected ListaDadosDependente listaDadosDependenteDTOToListaDadosDependente(ListaDadosDependenteDTO listaDadosDependenteDTO) {
        if ( listaDadosDependenteDTO == null ) {
            return null;
        }

        ListaDadosDependente listaDadosDependente = new ListaDadosDependente();

        listaDadosDependente.setDependente( dadosDependenteDTOListToDadosDependenteList( listaDadosDependenteDTO.getDependente() ) );

        return listaDadosDependente;
    }

    protected EnumTipoBeneficiarioType enumTipoBeneficiarioDTOToEnumTipoBeneficiarioType(EnumTipoBeneficiarioDTO enumTipoBeneficiarioDTO) {
        if ( enumTipoBeneficiarioDTO == null ) {
            return null;
        }

        EnumTipoBeneficiarioType enumTipoBeneficiarioType;

        switch ( enumTipoBeneficiarioDTO ) {
            case Titular: enumTipoBeneficiarioType = EnumTipoBeneficiarioType.Titular;
            break;
            case Dependente: enumTipoBeneficiarioType = EnumTipoBeneficiarioType.Dependente;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + enumTipoBeneficiarioDTO );
        }

        return enumTipoBeneficiarioType;
    }

    protected DadosBeneficiario dadosBeneficiarioDTOToDadosBeneficiario(DadosBeneficiarioDTO dadosBeneficiarioDTO) {
        if ( dadosBeneficiarioDTO == null ) {
            return null;
        }

        DadosBeneficiario dadosBeneficiario = new DadosBeneficiario();

        dadosBeneficiario.setNome( dadosBeneficiarioDTO.getNome() );
        dadosBeneficiario.setNumero( dadosBeneficiarioDTO.getNumero() );
        dadosBeneficiario.setDataNascimento( dadosBeneficiarioDTO.getDataNascimento() );
        dadosBeneficiario.setSituacao( dadosBeneficiarioDTO.getSituacao() );
        dadosBeneficiario.setNumeroCns( dadosBeneficiarioDTO.getNumeroCns() );
        dadosBeneficiario.setDataInclusaoPlano( dadosBeneficiarioDTO.getDataInclusaoPlano() );
        dadosBeneficiario.setTipoContrato( dadosBeneficiarioDTO.getTipoContrato() );
        dadosBeneficiario.setCategoriaTipoContrato( categoriaTipoContratoEnumToCategoriaTipoContratoEnum( dadosBeneficiarioDTO.getCategoriaTipoContrato() ) );
        dadosBeneficiario.setNumeroContrato( dadosBeneficiarioDTO.getNumeroContrato() );
        dadosBeneficiario.setNomeEmpresa( dadosBeneficiarioDTO.getNomeEmpresa() );
        dadosBeneficiario.setListaPlano( listaDadosPlanoDTOToListaDadosPlano( dadosBeneficiarioDTO.getListaPlano() ) );
        dadosBeneficiario.setInfoComplementar( dadosInfoComplementarDTOToDadosInfoComplementar( dadosBeneficiarioDTO.getInfoComplementar() ) );
        dadosBeneficiario.setListaDependente( listaDadosDependenteDTOToListaDadosDependente( dadosBeneficiarioDTO.getListaDependente() ) );
        dadosBeneficiario.setTipo( enumTipoBeneficiarioDTOToEnumTipoBeneficiarioType( dadosBeneficiarioDTO.getTipo() ) );

        return dadosBeneficiario;
    }

    protected ConsultarCarteirinhaResultado consultarCarteirinhaResultadoDTOToConsultarCarteirinhaResultado(ConsultarCarteirinhaResultadoDTO consultarCarteirinhaResultadoDTO) {
        if ( consultarCarteirinhaResultadoDTO == null ) {
            return null;
        }

        ConsultarCarteirinhaResultado consultarCarteirinhaResultado = new ConsultarCarteirinhaResultado();

        consultarCarteirinhaResultado.setBeneficiario( dadosBeneficiarioDTOToDadosBeneficiario( consultarCarteirinhaResultadoDTO.getBeneficiario() ) );

        return consultarCarteirinhaResultado;
    }

    protected StatusMensagemDTO statusMensagemToStatusMensagemDTO(StatusMensagem statusMensagem) {
        if ( statusMensagem == null ) {
            return null;
        }

        StatusMensagemDTO statusMensagemDTO = new StatusMensagemDTO();

        statusMensagemDTO.setDescricao( statusMensagem.getDescricao() );
        statusMensagemDTO.setDetalhe( statusMensagem.getDetalhe() );

        return statusMensagemDTO;
    }

    protected List<StatusMensagemDTO> statusMensagemListToStatusMensagemDTOList(List<StatusMensagem> list) {
        if ( list == null ) {
            return null;
        }

        List<StatusMensagemDTO> list1 = new ArrayList<StatusMensagemDTO>( list.size() );
        for ( StatusMensagem statusMensagem : list ) {
            list1.add( statusMensagemToStatusMensagemDTO( statusMensagem ) );
        }

        return list1;
    }

    protected StatusMensagensDTO statusMensagensTypeToStatusMensagensDTO(StatusMensagensType statusMensagensType) {
        if ( statusMensagensType == null ) {
            return null;
        }

        StatusMensagensDTO statusMensagensDTO = new StatusMensagensDTO();

        statusMensagensDTO.setMensagem( statusMensagemListToStatusMensagemDTOList( statusMensagensType.getMensagem() ) );

        return statusMensagensDTO;
    }

    protected br.com.segurosunimed.produto.odonto.dto.DadosBeneficiarioDTO.CategoriaTipoContratoEnum categoriaTipoContratoEnumToCategoriaTipoContratoEnum1(CategoriaTipoContratoEnum categoriaTipoContratoEnum) {
        if ( categoriaTipoContratoEnum == null ) {
            return null;
        }

        br.com.segurosunimed.produto.odonto.dto.DadosBeneficiarioDTO.CategoriaTipoContratoEnum categoriaTipoContratoEnum1;

        switch ( categoriaTipoContratoEnum ) {
            case Adesao: categoriaTipoContratoEnum1 = br.com.segurosunimed.produto.odonto.dto.DadosBeneficiarioDTO.CategoriaTipoContratoEnum.Adesao;
            break;
            case Empresarial: categoriaTipoContratoEnum1 = br.com.segurosunimed.produto.odonto.dto.DadosBeneficiarioDTO.CategoriaTipoContratoEnum.Empresarial;
            break;
            case Individual: categoriaTipoContratoEnum1 = br.com.segurosunimed.produto.odonto.dto.DadosBeneficiarioDTO.CategoriaTipoContratoEnum.Individual;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + categoriaTipoContratoEnum );
        }

        return categoriaTipoContratoEnum1;
    }

    protected DadosPlanoDTO dadosPlanoToDadosPlanoDTO(DadosPlano dadosPlano) {
        if ( dadosPlano == null ) {
            return null;
        }

        DadosPlanoDTO dadosPlanoDTO = new DadosPlanoDTO();

        dadosPlanoDTO.setCodigo( dadosPlano.getCodigo() );
        dadosPlanoDTO.setNome( dadosPlano.getNome() );
        dadosPlanoDTO.setCodigoRegistroAns( dadosPlano.getCodigoRegistroAns() );
        dadosPlanoDTO.setAbrangencia( dadosPlano.getAbrangencia() );
        dadosPlanoDTO.setNomeProduto( dadosPlano.getNomeProduto() );
        dadosPlanoDTO.setDescricaoRegulamentacao( dadosPlano.getDescricaoRegulamentacao() );
        dadosPlanoDTO.setTipoAcomodacao( dadosPlano.getTipoAcomodacao() );
        dadosPlanoDTO.setSegmentacaoAssistencial( dadosPlano.getSegmentacaoAssistencial() );
        dadosPlanoDTO.setTipoContratacao( dadosPlano.getTipoContratacao() );
        dadosPlanoDTO.setDataInicio( dadosPlano.getDataInicio() );
        dadosPlanoDTO.setValidadeCarteirinha( dadosPlano.getValidadeCarteirinha() );
        dadosPlanoDTO.setViaCarteirinha( dadosPlano.getViaCarteirinha() );
        dadosPlanoDTO.setDataCpt( dadosPlano.getDataCpt() );
        dadosPlanoDTO.setDataCarenciaUrgenciaEmergencia( dadosPlano.getDataCarenciaUrgenciaEmergencia() );
        dadosPlanoDTO.setDataCarenciaConsultaExameBasico( dadosPlano.getDataCarenciaConsultaExameBasico() );
        dadosPlanoDTO.setDataCarenciaTerapiaExamesEspeciais( dadosPlano.getDataCarenciaTerapiaExamesEspeciais() );

        return dadosPlanoDTO;
    }

    protected List<DadosPlanoDTO> dadosPlanoListToDadosPlanoDTOList(List<DadosPlano> list) {
        if ( list == null ) {
            return null;
        }

        List<DadosPlanoDTO> list1 = new ArrayList<DadosPlanoDTO>( list.size() );
        for ( DadosPlano dadosPlano : list ) {
            list1.add( dadosPlanoToDadosPlanoDTO( dadosPlano ) );
        }

        return list1;
    }

    protected ListaDadosPlanoDTO listaDadosPlanoToListaDadosPlanoDTO(ListaDadosPlano listaDadosPlano) {
        if ( listaDadosPlano == null ) {
            return null;
        }

        ListaDadosPlanoDTO listaDadosPlanoDTO = new ListaDadosPlanoDTO();

        listaDadosPlanoDTO.setPlano( dadosPlanoListToDadosPlanoDTOList( listaDadosPlano.getPlano() ) );

        return listaDadosPlanoDTO;
    }

    protected DadosInfoComplementarDTO dadosInfoComplementarToDadosInfoComplementarDTO(DadosInfoComplementar dadosInfoComplementar) {
        if ( dadosInfoComplementar == null ) {
            return null;
        }

        DadosInfoComplementarDTO dadosInfoComplementarDTO = new DadosInfoComplementarDTO();

        dadosInfoComplementarDTO.setCodigoRegistroOperadora( dadosInfoComplementar.getCodigoRegistroOperadora() );
        dadosInfoComplementarDTO.setNomeOperadora( dadosInfoComplementar.getNomeOperadora() );
        dadosInfoComplementarDTO.setNumeroSac( dadosInfoComplementar.getNumeroSac() );
        dadosInfoComplementarDTO.setNumeroAns( dadosInfoComplementar.getNumeroAns() );
        dadosInfoComplementarDTO.setSiteAns( dadosInfoComplementar.getSiteAns() );

        return dadosInfoComplementarDTO;
    }

    protected DadosDependenteDTO dadosDependenteToDadosDependenteDTO(DadosDependente dadosDependente) {
        if ( dadosDependente == null ) {
            return null;
        }

        DadosDependenteDTO dadosDependenteDTO = new DadosDependenteDTO();

        dadosDependenteDTO.setNome( dadosDependente.getNome() );
        dadosDependenteDTO.setDataNascimento( dadosDependente.getDataNascimento() );
        dadosDependenteDTO.setListaPlano( listaDadosPlanoToListaDadosPlanoDTO( dadosDependente.getListaPlano() ) );
        dadosDependenteDTO.setInfoComplementar( dadosInfoComplementarToDadosInfoComplementarDTO( dadosDependente.getInfoComplementar() ) );
        dadosDependenteDTO.setNumero( dadosDependente.getNumero() );
        dadosDependenteDTO.setNumeroCNS( dadosDependente.getNumeroCNS() );
        dadosDependenteDTO.setSituacao( dadosDependente.getSituacao() );

        return dadosDependenteDTO;
    }

    protected List<DadosDependenteDTO> dadosDependenteListToDadosDependenteDTOList(List<DadosDependente> list) {
        if ( list == null ) {
            return null;
        }

        List<DadosDependenteDTO> list1 = new ArrayList<DadosDependenteDTO>( list.size() );
        for ( DadosDependente dadosDependente : list ) {
            list1.add( dadosDependenteToDadosDependenteDTO( dadosDependente ) );
        }

        return list1;
    }

    protected ListaDadosDependenteDTO listaDadosDependenteToListaDadosDependenteDTO(ListaDadosDependente listaDadosDependente) {
        if ( listaDadosDependente == null ) {
            return null;
        }

        ListaDadosDependenteDTO listaDadosDependenteDTO = new ListaDadosDependenteDTO();

        listaDadosDependenteDTO.setDependente( dadosDependenteListToDadosDependenteDTOList( listaDadosDependente.getDependente() ) );

        return listaDadosDependenteDTO;
    }

    protected EnumTipoBeneficiarioDTO enumTipoBeneficiarioTypeToEnumTipoBeneficiarioDTO(EnumTipoBeneficiarioType enumTipoBeneficiarioType) {
        if ( enumTipoBeneficiarioType == null ) {
            return null;
        }

        EnumTipoBeneficiarioDTO enumTipoBeneficiarioDTO;

        switch ( enumTipoBeneficiarioType ) {
            case Titular: enumTipoBeneficiarioDTO = EnumTipoBeneficiarioDTO.Titular;
            break;
            case Dependente: enumTipoBeneficiarioDTO = EnumTipoBeneficiarioDTO.Dependente;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + enumTipoBeneficiarioType );
        }

        return enumTipoBeneficiarioDTO;
    }

    protected DadosBeneficiarioDTO dadosBeneficiarioToDadosBeneficiarioDTO(DadosBeneficiario dadosBeneficiario) {
        if ( dadosBeneficiario == null ) {
            return null;
        }

        DadosBeneficiarioDTO dadosBeneficiarioDTO = new DadosBeneficiarioDTO();

        dadosBeneficiarioDTO.setNome( dadosBeneficiario.getNome() );
        dadosBeneficiarioDTO.setNumero( dadosBeneficiario.getNumero() );
        dadosBeneficiarioDTO.setDataNascimento( dadosBeneficiario.getDataNascimento() );
        dadosBeneficiarioDTO.setSituacao( dadosBeneficiario.getSituacao() );
        dadosBeneficiarioDTO.setNumeroCns( dadosBeneficiario.getNumeroCns() );
        dadosBeneficiarioDTO.setDataInclusaoPlano( dadosBeneficiario.getDataInclusaoPlano() );
        dadosBeneficiarioDTO.setTipoContrato( dadosBeneficiario.getTipoContrato() );
        dadosBeneficiarioDTO.setCategoriaTipoContrato( categoriaTipoContratoEnumToCategoriaTipoContratoEnum1( dadosBeneficiario.getCategoriaTipoContrato() ) );
        dadosBeneficiarioDTO.setNumeroContrato( dadosBeneficiario.getNumeroContrato() );
        dadosBeneficiarioDTO.setNomeEmpresa( dadosBeneficiario.getNomeEmpresa() );
        dadosBeneficiarioDTO.setListaPlano( listaDadosPlanoToListaDadosPlanoDTO( dadosBeneficiario.getListaPlano() ) );
        dadosBeneficiarioDTO.setInfoComplementar( dadosInfoComplementarToDadosInfoComplementarDTO( dadosBeneficiario.getInfoComplementar() ) );
        dadosBeneficiarioDTO.setListaDependente( listaDadosDependenteToListaDadosDependenteDTO( dadosBeneficiario.getListaDependente() ) );
        dadosBeneficiarioDTO.setTipo( enumTipoBeneficiarioTypeToEnumTipoBeneficiarioDTO( dadosBeneficiario.getTipo() ) );

        return dadosBeneficiarioDTO;
    }

    protected ConsultarCarteirinhaResultadoDTO consultarCarteirinhaResultadoToConsultarCarteirinhaResultadoDTO(ConsultarCarteirinhaResultado consultarCarteirinhaResultado) {
        if ( consultarCarteirinhaResultado == null ) {
            return null;
        }

        ConsultarCarteirinhaResultadoDTO consultarCarteirinhaResultadoDTO = new ConsultarCarteirinhaResultadoDTO();

        consultarCarteirinhaResultadoDTO.setBeneficiario( dadosBeneficiarioToDadosBeneficiarioDTO( consultarCarteirinhaResultado.getBeneficiario() ) );

        return consultarCarteirinhaResultadoDTO;
    }
}
