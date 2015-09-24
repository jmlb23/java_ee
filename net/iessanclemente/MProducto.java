package net.iessanclemente;
public class MProducto
{
	public static void main(String... args){
		int[] numeros = {1,2,3,4,5};
		String[] nomes = {"peixe","pan","viño","auga","carne"};
		double[] prezo = {3.4,5.6,7.8,8.9,3.4};
		Producto[] p = new Producto[5];
		for(int i = 0; i< numeros.length; i++){
			 p[i] = new Producto(numeros[i],nomes[i],prezo[i]);
		}
		escribe(p);
		lee();
	
	}
	
	public static void escribe(Producto[] p){
		try{
			java.io.ObjectOutputStream ob = null;
		//no caso de que exista creo unha subclase anonima que sobreescriba o metodo writeStreamHeader para que non
		//agrege coma se fose o primeiro
                if(new java.io.File("/home/jesus/Escritorio/acesoDatos/net/iessanclemente/productos.dat").exists()){
                        ob = new java.io.ObjectOutputStream(new java.io.FileOutputStream(new java.io.File("/home/jesus/Escritorio/acesoDatos/net/iessanclemente/productos.dat"),true)){
                                @Override
				protected void writeStreamHeader() throws java.io.IOException{

                                }
                        };
                }else{
                        ob=new java.io.ObjectOutputStream(new java.io.FileOutputStream(new java.io.File("/home/jesus/Escritorio/acesoDatos/net/iessanclemente/productos.dat"),true));
                }

			for(int i = 0; i<p.length; i++){
				 ob.writeObject(p[i]);
			}
		}catch(java.io.IOException e){
			System.out.println("mal");
		}	
	}


	public static void lee(){
		java.io.ObjectInputStream is = null;
		try{
			is = new java.io.ObjectInputStream(new java.io.FileInputStream(new java.io.File("/home/jesus/Escritorio/acesoDatos/net/iessanclemente/productos.dat")));
			while(true){
				System.out.println((Producto)is.readObject());
			}
			
		}catch(java.io.IOException | ClassNotFoundException e){
			if(e instanceof java.io.EOFException){
				System.out.println("");
				return;
			}
			e.printStackTrace();
		}
		
		
	}
	
}
