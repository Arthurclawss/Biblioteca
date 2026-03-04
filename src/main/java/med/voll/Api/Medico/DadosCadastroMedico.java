package med.voll.Api.Medico;

import med.voll.Api.Endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco ) {
}
