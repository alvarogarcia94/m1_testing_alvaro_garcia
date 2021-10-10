package m1_testing_alvaro_garcia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MyOwnCRM {


    public static void main(String[] args) {

        //Crear el objeto scanner
        Scanner scanner = new Scanner(System.in);

        //Array donde almacenaremos los estudiantes
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("=================================================================");
            System.out.println("Bienvenido al CRM de estudiantes. Que operación desea realizar ? ");
            System.out.println("=================================================================");
            System.out.println("1) Ver estudiantes");  //Done
            System.out.println("2) Añadir un nuevo estudiante"); //Done
            System.out.println("3) Buscar un estudiante por nombre");
            System.out.println("6) Borrar todos los estudiantes"); //Done
            System.out.println("7) Salir ");  //Done

            int option = scanner.nextInt();

            if (option == 1) {
                //Si el usuario elige esta opción visualizará la lista de estudiantes (independientemente de los que haya).
                //Si el en la lista hay 0 estudiantes imprimirá este mensaje
                if (students.isEmpty()) {
                    System.out.println("No hay estudiantes");
                } else {
                    //Por el contrario si ya tenemos estudiantes dentro mostrara la lista de estudiantes y el número total.
                    System.out.println(students);
                    System.out.println("El número de estudiantes es: " + students.size());
                }
            }

            //La segunda opción nos permitirá dar de alta un nuevo/a alumno/a y guardarlo en la lista.
            if (option == 2) {
                //Nombre del alumno.
                System.out.println("Introduce el nombre de pila del alumno/a: ");
                String name = scanner.next();

                //Apellido del alumno.
                System.out.println("Introduce el apellido: ");
                String surname = scanner.next();


                //Edad
                System.out.println("Introduce la edad");
                int age = scanner.nextInt();

                //Teléfono
                System.out.println("Introduce un número de teléfono");
                int telefono = scanner.nextInt();

                Student student = new Student(name, surname, age, telefono);
                students.add(student);
                System.out.println("Alumno/a creado.");

            }

            if (option == 3) {
                //Entrada de datos
                System.out.println("Introduce el nombre de pila de un alumno/a: ");
                String name = scanner.next();

                boolean existName = false;
                for (Student student : students){
                    if (student.name.equals(student)){
                        existName = true;
                        System.out.println(student);
                        break;
                    }
                }

                if (!existName){
                    System.out.println("No existe el/la alumno/a con este nombre: " + name);
                }



            }

            if (option == 6) {
                students.clear();
                System.out.println("La lista vuelve a estar vacía");
            }

            //Si el usuario introduce un 7. finalizará la ejecución del programa com un mensaje de despedida.
            if (option == 7) {
                System.out.println("Hasta luego!!");
                break;
            }
        }
    }
}