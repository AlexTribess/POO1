package Pessoa;

public class PessoaMain {

	public static void main(String[] args) {

		Pessoa p = new Pessoa("Alex","Rua Wolfgang Roloff");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("Alex","Rua Wolfgang Roloff");
		pf.setCpf("124.038.959-03");
		pf.setEstadoCivil("Solteiro");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Alex","Rua Wolfgang Roloff");
		pj.setCnpj("12.523.956/0001-05");
		pj.setTipoEmpresa("Micro");
		System.out.println(pj);

	}

}
