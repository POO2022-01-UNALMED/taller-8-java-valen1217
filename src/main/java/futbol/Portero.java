package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre,int edad, short goles, byte dorsal){
		super(nombre,edad,"Portero");
		this.golesRecibidos = goles;
		this.dorsal = dorsal;
	}
	
	public String toString() {
		return "El futbolista " + super.getNombre() +
				" tiene " + super.getEdad() + ", y juega de " +
				super.getPosicion() + " con el dorsal " + dorsal +
				". Le han marcado " + golesRecibidos;
	}

	public int compareTo(Portero portero) {
		return  portero.golesRecibidos - this.golesRecibidos;
	}
	
	public boolean jugarConLasManos() {
		return true;
	}
	
	
	
	
	
}
