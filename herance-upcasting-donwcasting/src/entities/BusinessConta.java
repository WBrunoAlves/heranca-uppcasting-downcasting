package entities;



public class BusinessConta extends Conta{
	private Double limiteEmprest;

	public BusinessConta() {
		super();	
	}
	public BusinessConta(Integer numero, String titular, Double saldo, Double limiteEmprest) {
		super(numero, titular, saldo);
		this.limiteEmprest = limiteEmprest;
	}
	
	public Double getLimiteEmprest() {
		return limiteEmprest;
	}
	public void setLimiteEmprest(Double limiteEmprest) {
		this.limiteEmprest = limiteEmprest;
	}
	
	public void emprestar(double montante) {
		if (montante <= limiteEmprest) {
			saldo += montante + 10;
	/*atributo *saldo* pertence a classe Conta, 
	Seu modificador de acesso definido como PROTECTED deixa-o acessivel
	para TODAS AS CLASSES QUE PERTENCEM AO MESMO PACOTE*/		
		}
		
	}
	
	
	
}