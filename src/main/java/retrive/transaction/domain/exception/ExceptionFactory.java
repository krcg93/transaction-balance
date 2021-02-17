package retrive.transaction.domain.exception;

public enum ExceptionFactory {

    NULL_OR_EMPTY("El campo <f0> no puede estar vacio",400),
    NULL_ENTITY("La entidad <f0> no puede ser nula",400),
    INVALID_MAIL("El campo <f0> debe ser un mail valido",400),
    ERROR_SAVING("Error al momento de guardar la entidad <f0>",400),
    ENTITY_NOT_FOUND("Entidad <f0> no encontrada",404),
    INVALID_BORNDATE("La fecha de nacimiento debe ser menor a la fecha actual",400),
    ENTITY_NOT_VALID("Entidad <f0> no valida",400),
    VALUE_NOT_VALID("El campo <f0> no es valido",400),
    ENTITY_RESPONSE("No se encontraron datos para la entidad <f0>",404),
    TOKEN_NOT_FOUND("<f0>",404),
    NO_DATOS_ASEGURADO("No se encontraron riesgos para el asegurado.", 400),
    IDENTIFICACION_NO_EXISTE("El tipo de identificación del asegurado no existe.", 400);


    private String message;
    private int statusCode;
    ExceptionFactory(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }
    public BusinessException get(Throwable throwable, String... fields){
        return new BusinessException(replaceMessage(fields),throwable,this.statusCode);
    }
    public BusinessException get(String... fields){
        return new BusinessException(replaceMessage(fields), this.statusCode);
    }
    private String replaceMessage(String... fields){
        String message = this.message;
        for (int i=0;i<= fields.length-1;i++){
            message = message.replaceAll("<f"+i+">",fields[i]);
        }
        return message;
    }

}