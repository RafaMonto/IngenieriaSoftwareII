package Taller16.builder;

public class UsuarioDirector {
    public Usuario construct(UsuarioBuilder builder){
        builder.setNombre("Rafa")
                .setEdad(18)
                .setCorreo("rafa@")
                .setIntereses(null);
        return builder.build();
    }
}
