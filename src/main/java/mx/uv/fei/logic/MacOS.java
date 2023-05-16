package mx.uv.fei.logic;

public class MacOS extends SistemaOperativo {

    @Override
    protected void cargarSistemaOperativo(String distro) {
        System.out.println("Iniciar firmware EFI");
        System.out.println("Cargar núcleo XNU");
        System.out.println("Arranca Apple bootloader");
    }

    @Override
    protected void mostrarEscritorio(String escritorio) {
        System.out.println("Muestra escritorio MacOS");
    }
}
