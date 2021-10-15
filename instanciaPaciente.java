

public class instanciaPaciente {

    public static void main(String[] args) {
		
		Paciente paciente01 = new Paciente(0, null, null, null, null, null, null);
		
		paciente01.setNome("Joao");
		paciente01.setDataNascimento("10/11/2003");
		paciente01.setSexo("Masculino");
		paciente01.setPlanoSaude("SUS");
		paciente01.setAlergia("Dipirona");
		paciente01.setTipoSanguineo("O-");
		
		paciente01.getNome();
		paciente01.getDataNascimento();
		paciente01.getSexo();
		paciente01.getPlanoSaude();
		paciente01.getAlergia();
		paciente01.getTipoSanguineo();
		
	}
 }	
		

