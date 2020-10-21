package guia_del_parcial3;
 public class Evaluaciones{
	
	
	private double nota1 = 0,nota2,nota3,nota4,nota5,prom;
	//Agregamos los Setter
	public void setNota1(double nota1){
		this.nota1=nota1;
	}
	
		public void setNota2(double nota2){
		this.nota2=nota2;
	}
	
			public void setNota3(double nota3){
		this.nota3=nota3;
	}
	
			public void setNota4(double nota4){
		this.nota4=nota4;
	}
	
				public void setNota5(double nota5){
		this.nota5=nota5;
		
	}
	
		
	
	//Agregamos los Getter
	
	public double getNota1(){
		return nota1;
	}
	
		public double getNota2(){
		return nota2;
	}
	
		public double getNota3(){
		return  nota3;
	}
	
		public double getNota4(){
		return  nota4;
	}
	
		public double getNota5(){
		return nota5;
	}
	
	
	
	public	Double promedio(){
		
		prom=(nota1+nota2+nota3+nota4+nota5)/5;
		return prom;
	}
	
	public double Retorno(){
		return promedio();
	}
	public void metodo3(){
		System.out.println("La nota cuestionario  "+getNota1());
		System.out.println("La nota corto  "+getNota2());
		System.out.println("la nota actividad  "+getNota3());
		System.out.println("la nota actividad grupal "+getNota4());
		System.out.println("La nota PARCIAL "+getNota5());
		
		
	}
}