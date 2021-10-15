

public class instanciaPaciente {

	public static void main(String[] args) {
		
		Paciente paciente01 = new Paciente(0, null, null, null, null, null, null);
		
		paciente01.setNome("Joao");
		paciente01.setDataNascimento("10/11/2003");
		paciente01.setSexo("Masculino");
		paciente01.setPlanoSaude("SUS");
		paciente01.setAlergia("Dipirona");
		paciente01.setTipoSanguineo("O-");
		
		
	
		System.out.println("Nome: " + paciente01.getNome());
		System.out.println("Data de Nascimento: " + paciente01.getDataNascimento());
		System.out.println("Sexo: " + paciente01.getSexo());
		System.out.println("Plano de Saúde: " + paciente01.getPlanoSaude());
		System.out.println("Alergia: " + paciente01.getAlergia());
		System.out.println("Tipo Sanguineo: " +paciente01.getTipoSanguineo());
		
		paciente01.setNome("José");
		paciente01.setDataNascimento("06/01/1979");
		paciente01.setSexo("Masculino");
		paciente01.setPlanoSaude("SUS");
		paciente01.setAlergia("Ibuprofeno");
		paciente01.setTipoSanguineo("O-");
		
		System.out.println("");
		System.out.println("Nome: " + paciente01.getNome());
		System.out.println("Data de Nascimento: " + paciente01.getDataNascimento());
		System.out.println("Sexo: " + paciente01.getSexo());
		System.out.println("Plano de Saúde: " + paciente01.getPlanoSaude());
		System.out.println("Alergia: " + paciente01.getAlergia());
		System.out.println("Tipo Sanguineo: " +paciente01.getTipoSanguineo());
	}

}

		

