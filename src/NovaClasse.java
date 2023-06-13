
public class NovaClasse {

	public static void main(String[] args) {
	    Retangulo retangulo = new Retangulo(200, 3.0);
	       // Acessando métodos
        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();

        if(area == 10) {
            perimetro = 1000;

        }else {
        	perimetro = 10;
        }
        
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
	}

}
