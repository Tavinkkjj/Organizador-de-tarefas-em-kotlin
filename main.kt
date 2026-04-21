fun main() {

    println("Seja bem vindo!")
    println("Deseja um tutorial de como usar o programa? (Sim/Não)")

    val tut = readln()
    var tent = 3
    var cod = -1
    var most: Int

    data class Atv(val matA: String, val prazA: Int, val trfA: String)
    data class Prov(val matP: String, val prazP: Int, val trfP: String)
    data class Trab(val matT: String, val prazT: Int, val trfT: String)
    data class Event(val prazE: Int, val trfE: String)

    val listAtv = mutableListOf<Atv>()
    val listProv = mutableListOf<Prov>()
    val listTrab = mutableListOf<Trab>()
    val listEvent = mutableListOf<Event>()

    fun tutorial() {
        println(
            "Como deseja seu tutorial?" +
                    "\n1 -> completo" +
                    "\n2 -> atividades" +
                    "\n3 -> provas" +
                    "\n4 -> trabalhos" +
                    "\n5 -> eventos" +
                    "\n6 -> listas"
        )

        when (readln().toInt()) {
            1 -> {
                println("Programa para organizar tarefas.")
                println("1-Atividade | 2-Prova | 3-Trabalho | 4-Evento")
                println("5-Mostrar listas | 0-Sair")
            }
            2 -> println("Código 1: cadastrar atividade (matéria, prazo, descrição)")
            3 -> println("Código 2: cadastrar prova (matéria, prazo, conteúdo)")
            4 -> println("Código 3: cadastrar trabalho (matéria, prazo, descrição)")
            5 -> println("Código 4: cadastrar evento (prazo, descrição)")
            6 -> println("Código 5: mostrar listas cadastradas")
            else -> println("Opção inválida")
        }
    }

    if (tut == "Sim") {
        tutorial()
    }

    while (tent > 0 && cod != 0) {

        println(
            "\n1 Atividade | 2 Prova | 3 Trabalho | 4 Evento" +
                    "\n5 Mostrar | 6 Tutorial | 0 Sair"
        )

        cod = readln().toInt()

        when (cod) {
            1 -> {
                print("Matéria: ")
                val mat = readln()
                print("Prazo (dias): ")
                val praz = readln().toInt()
                print("Descrição: ")
                val desc = readln()
                listAtv.add(Atv(mat, praz, desc))
            }

            2 -> {
                print("Matéria: ")
                val mat = readln()
                print("Prazo (dias): ")
                val praz = readln().toInt()
                print("Conteúdo: ")
                val cont = readln()
                listProv.add(Prov(mat, praz, cont))
            }

            3 -> {
                print("Matéria: ")
                val mat = readln()
                print("Prazo (dias): ")
                val praz = readln().toInt()
                print("Descrição: ")
                val desc = readln()
                listTrab.add(Trab(mat, praz, desc))
            }

            4 -> {
                print("Prazo (dias): ")
                val praz = readln().toInt()
                print("Descrição: ")
                val desc = readln()
                listEvent.add(Event(praz, desc))
            }

            5 -> {
                println("1 Atv | 2 Prov | 3 Trab | 4 Event")
                most = readln().toInt()

                when (most) {
                    1 -> listAtv.forEachIndexed { i, a ->
                        println("${i + 1} - ${a.matA} | ${a.prazA} dias | ${a.trfA}")
                    }

                    2 -> listProv.forEachIndexed { i, p ->
                        println("${i + 1} - ${p.matP} | ${p.prazP} dias | ${p.trfP}")
                    }

                    3 -> listTrab.forEachIndexed { i, t ->
                        println("${i + 1} - ${t.matT} | ${t.prazT} dias | ${t.trfT}")
                    }

                    4 -> listEvent.forEachIndexed { i, e ->
                        println("${i + 1} - ${e.prazE} dias | ${e.trfE}")
                    }

                    else -> println("Opção inválida")
                }
            }

            6 -> tutorial()

            0 -> println("Encerrado")

            else -> {
                println("Erro!")
                tent--
                println("Tentativas: $tent")
            }
        }
    }
