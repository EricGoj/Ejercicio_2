package com.prueba.a.Utils;

import com.prueba.a.Entidad.AMEX;
import com.prueba.a.Entidad.Marca;
import com.prueba.a.Entidad.NARA;
import com.prueba.a.Entidad.VISA;

public class TarjetaCreditoUtils {
	

	 
	 public Double getOperacionTasa(Double tasaPorcentaje , Double importe) {
		 
		 Double calculo=importe*tasaPorcentaje/100;
		 Double total=importe+calculo;
		 return total;
		 
	 }
	 
	 public Marca getMarcabyName(String name) {
		 switch (name.toLowerCase()) {
		 case "visa":
             return VISA.getInstance();
         case "nara":
             return NARA.getInstance();
         case "amex":
             return AMEX.getInstance();
         default:
             throw new IllegalArgumentException("La marca no existe");
		 }
		 
	 }
	 
}
