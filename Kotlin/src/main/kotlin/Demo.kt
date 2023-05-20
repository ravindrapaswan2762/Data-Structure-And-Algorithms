package post6

import java.util.*

fun main(args :Array<String>){
    val read = Scanner(System.`in`)
    val player1Symbol = 1
    val player2Symbol = 2

    //creates an instance of the board
    val b = OthelloBoard()

    //reads the number of inputs
    var n: Int = read.nextInt()

    //sets P1's turn as true
    var p1Turn = true

    //computes the inputs to produce results
    while (n > 0) {
        val x: Int = read.nextInt()
        val y: Int = read.nextInt()
        var ans: Boolean
        ans = if (p1Turn) {
            b.move(player1Symbol, x, y)
        } else {
            b.move(player2Symbol, x, y)
        }
        if (ans) {
            b.print()
            p1Turn = !p1Turn
            n--
        } else {
            println(ans)
        }
    }
}

class OthelloBoard {
    private val board: Array<IntArray> = Array(8) { IntArray(8) }
    //displays the board
    fun print() {
        board.forEach { row ->
            row.forEach {
                print("$it ")
            }
            println()
        }
    }

    fun move(symbol: Int, x: Int, y: Int): Boolean {
        // Complete this function
        /* Don't write assignment.main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
//      7   0  1
//        \ | /
//         \|/
//   6<-----------> 2
//        / | \
//       /  |  \
//      5   4   3

        var bool: Boolean = false;
        val n: Int = 8;
        for (i in 0..xDir.size-1){

            var x2: Int = x;
            var y2: Int = y;

            if (i==0){
                if (board[x2-1][y2]==symbol){bool=false;}
                else{
                    while (x2>0){
                        if (board[x2-1][y2] == symbol){
                            bool=true;
                        }else{x2--;}
                    }
                }
            }
            if (i==1){
                if (board[x2-1][y2+1]==symbol){bool=false;}
                else{
                    while (x2>0 && y2<7){
                        if (board[x2-1][y2+1] == symbol){
                            bool=true;
                        }else{x2--; y2++;}
                    }
                }
            }
            if (i==2){
                if (board[x2][y2+1]==symbol){bool=false;}
                else{
                    while (y2<7){
                        if (board[x2][y2+1] == symbol){
                            bool=true;
                        }else{y2++;}
                    }
                }
            }
            if (i==3){
                if (board[x2+1][y2+1]==symbol){bool=false;}
                else{
                    while (x2<7 && y2<7){
                        if (board[x2+1][y2+1] == symbol){
                            bool=true;
                        }else{x2++;y2++}
                    }
                }
            }
            if (i==4){
                if (board[x2+1][y2]==symbol){bool = false;}
                else{
                    while (x2<7){
                        if (board[x2+1][y2] == symbol){
                            bool = true;
                        }else{x2++;}
                    }
                }
            }
            if (i==5){
                if (board[x2+1][y2-1]==symbol){bool = false;}
                else{
                    while (x2<7 && y2>0){
                        if (board[x2+1][y2-1] == symbol){
                            bool = true;
                        }else{x2++;y2--}
                    }
                }
            }
            if (i==6){
                if (board[x2][y2-1]==symbol){bool = false;}
                else{
                    while (y2>0){
                        if (board[x2][y2-1] == symbol){
                            bool = true;
                        }else{y2--;}
                    }
                }
            }
            if (i==7){
                if (board[x2-1][y2-1]==symbol){bool = false;}
                else{
                    while (x2>0 && y2>0){
                        if (board[x2-1][y2-1] == symbol){
                            bool = true;
                        }else{x2--;y2--}
                    }
                }
            }

        }

        return bool;
    }

    companion object {
        const val player1Symbol = 1
        const val player2Symbol = 2
        private val xDir = intArrayOf(-1, -1,  0,  1,  1,  1,  0, -1)
        private val yDir = intArrayOf(0,   1,  1,  1,  0, -1, -1, -1)
    }

    init {
        board[3][3] = player1Symbol
        board[3][4] = player2Symbol
        board[4][3] = player2Symbol
        board[4][4] = player1Symbol
    }
}