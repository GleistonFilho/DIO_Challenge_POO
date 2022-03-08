import br.com.dio.Challenge.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso PHP");
        curso2.setDescricao("Descrição do curso PHP");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Ana");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + dev1.getNome() +" : " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos " + dev1.getNome() +" : " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + dev1.getNome() +" : " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());

        System.out.println("------");

        Dev dev2 = new Dev();
        dev2.setNome("Bruno");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + dev2.getNome() +" : " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos " + dev2.getNome() +" : " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + dev1.getNome() +" : " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());
    }
}
