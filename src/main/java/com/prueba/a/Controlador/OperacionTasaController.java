package com.prueba.a.Controlador;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.a.Entidad.Marca;
import com.prueba.a.Utils.TarjetaCreditoUtils;

@RestController
public class OperacionTasaController {
	
	   @GetMapping(path = "/operation", produces = "application/JSON", consumes = "application/JSON")
	    public Response getOperationInfo(@RequestBody Request request) {
	        try {
	            final TarjetaCreditoUtils utils = new TarjetaCreditoUtils();
	            final String marcaName= request.marca;
	            double monto = request.monto;
	            final Marca marca = utils.getMarcabyName(marcaName);
	            final Double tasa = marca.Tasa();
	            Double total=utils.getOperacionTasa(tasa, monto);
	            return new Response( marcaName,monto,(double) Math.round(tasa),total ,"successful request", HttpStatus.OK);

	        } catch (final IllegalArgumentException e) {
	            return new Response(HttpStatus.SERVICE_UNAVAILABLE, "Request body format error");
	        }
	    }

}
