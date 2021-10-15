1. 
# Armar rutas REST (URI + Método)

Deberia ser una get request: //guardarropa/id_guardarropa/prendas

# Esbozar qué información se enviaría en el body (por ej, en un JSON)

{
	"path": GET + "prendas"
	"head": "JSON"
	"body": ""
}

# Pensar códigos de respuesta posibles para cada operación

 - Codigo 200: Respuesta exitosa
 - Codigo 404: No se pudo obtener el guardarropas

 # Esbozar bodies de respuesta posibles

 {
	[{
	"id": 0,
	"TipoPrenda": "INFERIOR",
	"colorPrincipal": "rojo",
	"Trama": "lisa"
    "Material": "cuero",
	},
	...
    ]
}

2. 
# Armar rutas REST (URI + Método)

Deberia ser un POST request: //guardarropa/id_guardarropa/prenda_nueva

# Esbozar qué información se enviaría en el body (por ej, en un JSON)

{
	"path": POST + "prenda_nueva"
	"head": "JSON"
	"body": {datos de la nueva prenda}
}

# Pensar códigos de respuesta posibles para cada operación

 - Codigo 200: Respuesta exitosa, se pudo crear la prenda
 - Codigo 404: No se pudo obtener el guardarropas
 - Codigo 500: No se pudo crear la prenda (parametros erroneos por ejemplo)

 # Esbozar bodies de respuesta posibles

 - La respuesta sera un mensaje de error o una confirmacion si la prenda pudo ser creada

3. 
# Armar rutas REST (URI + Método)

Deberia ser un GET request: //guardarropa/id_guardarropa/prenda/id_prenda

# Esbozar qué información se enviaría en el body (por ej, en un JSON)

{
	"path": GET + "id_guardarropa" + "id_prenda"
	"head": "JSON"
	"body": 
}

# Pensar códigos de respuesta posibles para cada operación

 - Codigo 200: Respuesta exitosa
 - Codigo 404: No se pudo obtener el guardarropas o la prenda y la ruta no existe

 # Esbozar bodies de respuesta posibles

  {
	{
	"id": 0,
	"TipoPrenda": "INFERIOR",
	"colorPrincipal": "rojo",
	"Trama": "lisa"
    "Material": "cuero",
	}
}

4. 
# Armar rutas REST (URI + Método)

Deberia ser un DELETE request: //guardarropa/id_guardarropa/prenda/id_prenda

# Esbozar qué información se enviaría en el body (por ej, en un JSON)

{
	"path": DELETE + "id_guardarropa" + "id_prenda"
	"head": "JSON"
	"body": 
}

# Pensar códigos de respuesta posibles para cada operación

 - Codigo 200: Respuesta exitosa
 - Codigo 404: No se pudo obtener el guardarropas o la prenda y la ruta no existe

 # Esbozar bodies de respuesta posibles

 - La respuesta sera un mensaje de error o una confirmacion si la prenda pudo ser borrada.

5. 
# Armar rutas REST (URI + Método)

Deberia ser un GET request: //eventos

# Esbozar qué información se enviaría en el body (por ej, en un JSON)

{
	"path": GET + "eventos"
	"head": "JSON"
	"body": 
}

# Pensar códigos de respuesta posibles para cada operación

 - Codigo 200: Respuesta exitosa
 - Codigo 404: La ruta no existe

 # Esbozar bodies de respuesta posibles

{
	[{
    "id_evento":0
	"tipo": "lluvia fuerte"
	"fecha": "15/10/2021"
	},
...]
}

6. 
# Armar rutas REST (URI + Método)

Deberia ser un GET request: //eventos/evento_id/sugerencias

# Esbozar qué información se enviaría en el body (por ej, en un JSON)

{
	"path": GET + "evento_id" + "sugerencias"
	"head": "JSON"
	"body": 
}

# Pensar códigos de respuesta posibles para cada operación

 - Codigo 200: Respuesta exitosa
 - Codigo 404: no se encontro el evento

 # Esbozar bodies de respuesta posibles


  {
	[{
	"id": 0,
	"TipoPrenda": "INFERIOR",
	"colorPrincipal": "rojo",
	"Trama": "lisa"
    "Material": "cuero",
	}]
}
