package Curso1_Semana2C;

public class Aluno {

	Integer bim1;
	Integer bim2;
	Integer bim3;
	Integer bim4;
	
	public Integer media(){
		Integer total = 0;
		total += this.bim1;
		total += this.bim2;
		total += this.bim3;
		total += this.bim4;
		
		return total / 4;
	}
	
	public Boolean verificarSePassouDeAno(){
		Integer media = media();
		
		if(media >= 60)
			return true;
		else
			return false;
	}
}

