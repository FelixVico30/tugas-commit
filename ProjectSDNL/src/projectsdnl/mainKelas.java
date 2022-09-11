package projectsdnl;

import java.util.List;
import static projectsdnl.Dijkstra.computePaths;
import static projectsdnl.Dijkstra.getShortestPathTo;
import java.util.Scanner;

public class mainKelas {

    public static void main(String[] args) {
        Vertex v0 = new Vertex("Kos Putri 126");
        Vertex v1 = new Vertex("Kos YS Smile");
        Vertex v2 = new Vertex("Kos Majus");
        Vertex v3 = new Vertex("Kos Putra Wisma");
        Vertex v4 = new Vertex("Kos Biru");
        Vertex v5 = new Vertex("Kos Hijau");
        Vertex v6 = new Vertex("Kos Putih");

        v0.adjacencies = new Edge[]{
            new Edge(v1, 5),
            new Edge(v2, 10),
            new Edge(v3, 8),
            new Edge(v5, 4)};
        v1.adjacencies = new Edge[]{
            new Edge(v0, 5),
            new Edge(v2, 3),
            new Edge(v4, 7),
            new Edge(v5, 6),
            new Edge(v6, 8)};
        v2.adjacencies = new Edge[]{
            new Edge(v0, 10),
            new Edge(v1, 3),
            new Edge(v6, 7)};
        v3.adjacencies = new Edge[]{
            new Edge(v0, 8),
            new Edge(v4, 2),
            new Edge(v5, 5)};
        v4.adjacencies = new Edge[]{
            new Edge(v1, 7),
            new Edge(v3, 2),
            new Edge(v5, 12)};
        v5.adjacencies = new Edge[]{
            new Edge(v0, 4),
            new Edge(v1, 6),
            new Edge(v3, 5),
            new Edge(v4, 12)};
        v6.adjacencies = new Edge[]{
            new Edge(v1, 8),
            new Edge(v2, 7)};

        Vertex[] vertices = {v0, v1, v2, v3, v4, v5, v6};

        Scanner kelompokDua = new Scanner(System.in);
        System.out.print("Masukan kos asal (Kos putri 126/kos YS Smile/Kos Majus/kos Putra Wisma/Kos Biru/Kos Hijau/Kos Putih) : ");
        String kosAsal = kelompokDua.nextLine();
        if (kosAsal.equalsIgnoreCase("Kos Putri 126")) {
            computePaths(v0);
            for (Vertex v : vertices) {
                System.out.println("Jarak ke " + v + " adalah " + v.minDistance + " Km dari  " + v0);
                List<Vertex> path = getShortestPathTo(v);
                System.out.println("Kos yang dilalui " + path);
                System.out.println("----------------------------------------------------");
                System.out.println("                                                     ");
            }
        } else if (kosAsal.equalsIgnoreCase("Kos YS Smile")) {
            computePaths(v1);
            for (Vertex v : vertices) {
                System.out.println("Jarak ke  " + v + " adalah " + v.minDistance + " Km dari  " + v1);
                List<Vertex> path = getShortestPathTo(v);
                System.out.println("Kos yang dilalui " + path);
                System.out.println("---------------------------------------------------");
                System.out.println("                                                    ");
            }
        } else if (kosAsal.equalsIgnoreCase("Kos Majus")) {
            computePaths(v2);
            for (Vertex v : vertices) {
                System.out.println("Jarak ke  " + v + " adalah " + v.minDistance + " Km dari  " + v2);
                List<Vertex> path = getShortestPathTo(v);
                System.out.println("Kos yang dilalui " + path);
                System.out.println("-----------------------------------------------------");
                System.out.println("                                                      ");
            }
        } else if (kosAsal.equalsIgnoreCase("Kos Putra Wisma")) {
            computePaths(v3);
            for (Vertex v : vertices) {
                System.out.println("Jarak ke  " + v + " adalah " + v.minDistance + " Km dari  " + v3);
                List<Vertex> path = getShortestPathTo(v);
                System.out.println("Kos yang dilalui " + path);
                System.out.println("------------------------------------------------------");
                System.out.println("                                                      ");
            }
        } else if (kosAsal.equalsIgnoreCase("Kos Biru")) {
            computePaths(v4);
            for (Vertex v : vertices) {
                System.out.println("Jarak ke  " + v + " adalah " + v.minDistance + " Km dari  " + v4);
                List<Vertex> path = getShortestPathTo(v);
                System.out.println("Kos yang dilalui " + path);
                System.out.println("-----------------------------------------------------");
                System.out.println("                                                      ");
            }
        } else if (kosAsal.equalsIgnoreCase("Kos Hijau")) {
            computePaths(v5);
            for (Vertex v : vertices) {
                System.out.println("Jarak ke  " + v + " adalah " + v.minDistance + " Km dari  " + v5);
                List<Vertex> path = getShortestPathTo(v);
                System.out.println("Kos yang dilalui " + path);
                System.out.println("---------------------------------------------------");
                System.out.println("                                                   ");
            }
        } else if (kosAsal.equalsIgnoreCase("Kos Putih")) {
            computePaths(v6);
            for (Vertex v : vertices) {
                System.out.println("Jarak ke  " + v + " adalah " + v.minDistance + " Km dari  " + v6);
                List<Vertex> path = getShortestPathTo(v);
                System.out.println("Kos yang dilalui " + path);
                System.out.println("---------------------------------------------------");
                System.out.println("                                                    ");
            }

        }

    }

}
