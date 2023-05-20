package TemplateMethod.logic;


public abstract class SistemaOperativo {

    protected abstract void cargarSistemaOperativo(String distro);
    protected abstract void mostrarEscritorio(String escritorio);

    private void encenderComputadora(){
        System.out.println("Encendiendo Computadora...");
    }

    public final void iniciarSistemaOperativo(String distro) {
        encenderComputadora();
        cargarSistemaOperativo(distro);
        mostrarEscritorio(distro);
    }
}
