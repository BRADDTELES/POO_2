package entities;

public class Tv extends Equip_Eletronico{
					
					private boolean ligado;
					
					public void ligar(){
										ligado = true;
					}
					
					public void desligar(){
										ligado = false;
					}
					
					public String toString(){
										return "Tv ligado ? "
										        + ligado;
					}
}