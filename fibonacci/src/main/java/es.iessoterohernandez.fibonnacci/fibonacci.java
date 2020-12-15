package es.iessoterohernandez.fibonnacci;

public class fibonacci {
    
    int fibonacci(int n)
{
    if (n>1){
       return fibonacci(n-1) + fibonacci(n-2);  //funci�n recursiva
    }
    else if (n==1) {  // caso base
        return 1;
    }
    else if (n==0){  // caso base
        return 0;
    }
    else{ //error
        System.out.println("Debes ingresar un tama�o mayor o igual a 1");
        return -1; 
    }
}
    public int tama�o;
    public String nombre;

    public fibonacci() {
    }

    public fibonacci(String nombre, int tama�o) {
        this.nombre = nombre;
        this.tama�o = tama�o;
    }

    public void mostrarSerie() {
        System.out.println(this.nombre + " de tama�o " + this.tama�o + ":");
        for (int i = 0; i < tama�o; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTama�o() {
        return tama�o;
    }

    public void setTama�o(int tama�o) {
        this.tama�o = tama�o;
    }
}