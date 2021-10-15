public class Instancia {
    public static void main(String[] args) {
		
		Endereco endereco01 = new Endereco(null, null, null, null, null, null, null);
		
		endereco01.setRua("Amourim Boutrão");
		endereco01.setNumero("11");
		endereco01.setComplemento("Centro");
		endereco01.setBairro("Liberdade");
		endereco01.setCidade("França do Norte");
		endereco01.setUf("Bahia");
		
		Medico medico01 = new Medico(0, null, null, null, null);
		
		medico01.setCodigo(2703);
		medico01.setNome("Clarissa");
		medico01.setSexo("Feminino");
		medico01.setEspecialidade("Endocrinologia");
		medico01.setEndereco(endereco01);
		
		System.out.println("Codigo: " + medico01.getCodigo());
		System.out.println("Nome: " + medico01.getNome());
		System.out.println("Sexo: " + medico01.getSexo());
		System.out.println("Especialidade: " + medico01.getEspecialidade());
		System.out.println("Endereço: " + endereco01.getRua() + ", "
				 + endereco01.getNumero() + ", "
						 + endereco01.getComplemento() + ", "
								 + endereco01.getBairro() + ", "
										 + endereco01.getCidade() + ", "
												 + endereco01.getUf());
		
		
	
		
	}

}
