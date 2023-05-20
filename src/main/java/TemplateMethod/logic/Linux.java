package TemplateMethod.logic;

public class Linux extends SistemaOperativo {

    @Override
    protected void cargarSistemaOperativo(String distro) {
        System.out.println("Inicia POST...");
        System.out.println("Cargar UEFI...");
        System.out.println("Arranca bootloader GRUB...");
        switch (distro) {
            case "Arch":
                System.out.println("Cargar kernels de Arch");
                break;
            case "Ubuntu":
                System.out.println("Cargar kernels de Ubuntu");
                break;
            case "Fedora":
                System.out.println("Cargar kernels de Fedora");
                break;
        }
        System.out.println("Se ejecuta Init...");
    }

    @Override
    protected void mostrarEscritorio(String escritorio) {
        switch (escritorio) {
            case "Arch":
                System.out.println("Muestra escritorio GNOME");
                break;
            case "Ubuntu":
                System.out.println("Muestra escritorio KDE");
                break;
            case "Fedora":
                System.out.println("Muestra escritorio XCFE");
                break;
        }
    }
}
