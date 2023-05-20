package datastructureAndALGORITHM.GraphCNC;

public class MainClass {
    //Graph: it is a non linear data structure.
    //
    //         (a)---------(b)
    //         |   \        |       vertices: {a,b,c,d,e}
    //         |    (c)     |       edges: { (a,b) (a,c) (a,d)
    //         |   /   \    |                (b,e) (c,d) (c,e)
    //         | /       \  |                (d,e)
    //        (d)---------(e)               }

    // Graph vs Tree:
    // Tree is also a non-linear type ds so its also a graph type ds. But with special condition
    // Graph can be circular but tree cannot
    // Graph can have a connection less node but tree have not.


    // Terminilogy:
    // Adjacent Vertices -> two vertices directly connected through edges.
    // Degree -> Total number of egdes are directly connected through a vertices.
    // Path -> There can be multiple path b/n two vertices.
    // Connected Graph -> There can be multiple paths to reach all vertices from a particular vertices.
    // Dis Connected Graph ->
    // Sub Graph ->
    // Connected Components ->
    // Tree ->
    // Forest -> it have multiple trees or Connected Components.
    // Spaning Tree -> Minimum number of edges that need to graph connected after removing some edges from graph.
    // Complete Graph -> Each vertices should be directly-connected to each other.


    // Number of edges required:
    //         Tree-> n-1,      n-1<= Connected Graph <=[n*(n-1)]/2,    Complete Graph-> [n*(n-1)]/2,

    // Variation of graph:
    //            (1) directed: one way   (2) undirected: two way    (3) weighted: stored information in the edges.
}
