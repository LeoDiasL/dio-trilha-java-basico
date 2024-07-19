import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao(" Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Fulano " + devFulano.getConteudosInscritos());

        devFulano.progredir();

        System.out.println("===");

        System.out.println("Conteúdos inscritos Fulano " + devFulano.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Fulano " + devFulano.getConteudosConcluidos());
        System.out.println("XP:" + devFulano.calcularTotalXp());

        System.out.println("---------");

        Dev devCiclano = new Dev();
        devCiclano.setNome("Ciclano");
        devCiclano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Ciclano " + devCiclano.getConteudosInscritos());

        devCiclano.progredir();
        devCiclano.progredir();

        System.out.println("===");

        System.out.println("Conteúdos inscritos Ciclano " + devCiclano.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Ciclano " + devCiclano.getConteudosConcluidos());
        System.out.println("XP:" + devCiclano.calcularTotalXp());

    }
}
