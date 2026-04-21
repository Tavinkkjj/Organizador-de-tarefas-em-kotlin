fun main() {

    println("Seja bem vindo!")
    println("Deseja um tutorial de como usar o programa? (Sim/Não)")

    val tut = readln()
    var tent = 3
    var cod = 777
    var most = 777

    data class Atv(
        val matA: String,
        val prazA: Int,
        val trfA: String
    )

    data class Prov(
        val matP: String,
        val prazP: Int,
        val trfP: String
    )

    data class Trab(
        val matT: String,
        val prazT: Int,
        val trfT: String
    )

    data class Event(
        val prazE: Int,
        val trfE: String
    )

    val listAtv = mutableListOf<Atv>()
    val listProv = mutableListOf<Prov>()
    val listTrab = mutableListOf<Trab>()
    val listEvent = mutableListOf<Event>()

    if (tut == "Sim"){
        println("Abrindo tutorial...")

        println(
            "Como deseja seu tutorial?" +
                    "\n1 -> tutorial completo" +
                    "\n2 -> apenas atividades" +
                    "\n3 -> apenas provas" +
                    "\n4 -> apenas trabalhos" +
                    "\n5 -> apenas eventos" +
                    "\n6 -> mostrar listas"
        )

        val tuti = readln().toInt()

        if (tuti == 1) {
            println("=== TUTORIAL COMPLETO ===")
            println("Este programa organiza suas tarefas.")
            println("1 -> Cadastrar atividade: salva matéria, prazo e descrição.")
            println("2 -> Cadastrar prova: salva matéria, prazo e conteúdo.")
            println("3 -> Cadastrar trabalho: salva matéria, prazo e descrição.")
            println("4 -> Cadastrar evento: salva prazo e descrição.")
            println("5 -> Mostrar listas: exibe o que foi cadastrado.")
            println("0 -> Finaliza o programa.")
        } else if (tuti == 2) {
            println("=== ATIVIDADES ===")
            println("Use o código 1.")
            println("Digite matéria, prazo (dias) e descrição.")
        } else if (tuti == 3) {
            println("=== PROVAS ===")
            println("Use o código 2.")
            println("Digite matéria, prazo (dias) e conteúdo.")
        } else if (tuti == 4) {
            println("=== TRABALHOS ===")
            println("Use o código 3.")
            println("Digite matéria, prazo (dias) e descrição.")
        } else if (tuti == 5) {
            println("=== EVENTOS ===")
            println("Use o código 4.")
            println("Digite prazo (dias) e descrição.")
        } else if (tuti == 6) {
            println("=== MOSTRAR LISTAS ===")
            println("Use o código 5.")
            println("Depois escolha qual lista deseja ver.")
        } else {
            println("Opção inválida")
        }


    }else if (tut == "Não") {

        while (tent > 0 && cod != 0) {

            println(
                "Códigos para uso do programa:" +
                        "\n1 -> Cadastrar uma atividade" +
                        "\n2 -> Cadastrar uma prova" +
                        "\n3 -> Cadastrar um trabalho" +
                        "\n4 -> Cadastrar um evento" +
                        "\n5 -> Mostrar atividades e outros" +
                        "\n6 -> Mostrar o tutorial" +
                        "\n0 -> Finalizar seção"
            )

            println("Digite um código:")
            cod = readln().toInt()

            if (cod == 1) {

                print("Digite a matéria da atividade: ")
                val matA = readln()

                print("Digite o prazo da atividade em dias: ")
                val prazA = readln().toInt()

                print("Digite uma breve explicação da tarefa: ")
                val trfA = readln()

                val atv = Atv(matA, prazA, trfA)
                listAtv.add(atv)

            } else if (cod == 2) {//cadastrar prova

                print("Digite a matéria da prova: ")
                val matP = readln()

                print("Digite o prazo da prova em dias: ")
                val prazP = readln().toInt()

                print("Digite uma breve explicação da matéria: ")
                val trfP = readln()

                val prov = Prov(matP, prazP, trfP)
                listProv.add(prov)

            } else if (cod == 3) {//cadastrar trabalho

                print("Digite a matéria da prova: ")
                val matT = readln()

                print("Digite o prazo do trabalho em dias: ")
                val prazT = readln().toInt()

                print("Digite uma breve explicação do trabalho: ")
                val trfT = readln()

                val trab = Trab(matT, prazT, trfT)
                listTrab.add(trab)

            } else if (cod == 4) {//cadastrar evento

                print("Digite o prazo do evento em dias: ")
                val prazE = readln().toInt()

                print("Digite uma breve explicação do evento: ")
                val trfE = readln()

                val event = Event(prazE, trfE)
                listEvent.add(event)

            }

            else if (cod == 5) {//mostrar atividades/outros
                print("Digite o código referente à lista que deseja mostrar: ")
                println("Códigos:" +
                        "\n1 -> para mostrar atividades:" +
                        "\n2 -> para mostrar as provas" +
                        "\n3 -> para mostrar os trabalhos" +
                        "\n4 -> para mostrar os eventos")
                most = readln().toInt()
                if (most == 1) {
                    for ((i, atv) in listAtv.withIndex()) {
                        println("Atividade ${i + 1}")
                        println("Matéria: ${atv.matA}")
                        println("Prazo: ${atv.prazA} dias")
                        println("Tarefa: ${atv.trfA}")
                        println("----------------------")
                    }
                }else if (cod == 2) {
                    for ((i, prov) in listProv.withIndex()) {
                        println("Prov ${i + 1}")
                        println("Matéria: ${prov.matP}")
                        println("Prazo: ${prov.prazP} dias")
                        println("Conteúdo: ${prov.trfP}")
                        println("----------------------")
                    }
                }else if (cod == 3) {
                    for ((i, trab) in listTrab.withIndex()) {
                        println("Trabalho ${i + 1}")
                        println("Matéria: ${trab.matT}")
                        println("Prazo: ${trab.prazT} dias")
                        println("Tarefa: ${trab.trfT}")
                        println("----------------------")
                    }
                }else if (cod == 4) {
                    for ((i, event) in listEvent.withIndex()) {
                        println("Evento ${i + 1}")
                        println("Prazo: ${event.prazE} dias")
                        println("Evento: ${event.trfE}")
                        println("----------------------")
                    }
                }
            } else if (cod == 6) {//tutorial
                println("Como deseja seu tutoria?" +
                        "\n1 -> tutorial completo" +
                        "\n2 -> apenas atividades" +
                        "\n3 -> apenas provas" +
                        "\n4 -> apenas trabalhos" +
                        "\n5 -> apenas eventos")
                var tuti = readln()

            }else if (cod == 6) {//tutorial
                println(
                    "Como deseja seu tutorial?" +
                            "\n1 -> tutorial completo" +
                            "\n2 -> apenas atividades" +
                            "\n3 -> apenas provas" +
                            "\n4 -> apenas trabalhos" +
                            "\n5 -> apenas eventos" +
                            "\n6 -> mostrar listas"
                )

                val tuti = readln().toInt()

                if (tuti == 1) {
                    println("=== TUTORIAL COMPLETO ===")
                    println("Este programa organiza suas tarefas.")
                    println("1 -> Cadastrar atividade: salva matéria, prazo e descrição.")
                    println("2 -> Cadastrar prova: salva matéria, prazo e conteúdo.")
                    println("3 -> Cadastrar trabalho: salva matéria, prazo e descrição.")
                    println("4 -> Cadastrar evento: salva prazo e descrição.")
                    println("5 -> Mostrar listas: exibe o que foi cadastrado.")
                    println("0 -> Finaliza o programa.")
                }

                else if (tuti == 2) {
                    println("=== ATIVIDADES ===")
                    println("Use o código 1.")
                    println("Digite matéria, prazo (dias) e descrição.")
                }

                else if (tuti == 3) {
                    println("=== PROVAS ===")
                    println("Use o código 2.")
                    println("Digite matéria, prazo (dias) e conteúdo.")
                }

                else if (tuti == 4) {
                    println("=== TRABALHOS ===")
                    println("Use o código 3.")
                    println("Digite matéria, prazo (dias) e descrição.")
                }

                else if (tuti == 5) {
                    println("=== EVENTOS ===")
                    println("Use o código 4.")
                    println("Digite prazo (dias) e descrição.")
                }

                else if (tuti == 6) {
                    println("=== MOSTRAR LISTAS ===")
                    println("Use o código 5.")
                    println("Depois escolha qual lista deseja ver.")
                }

                else {
                    println("Opção inválida")
                }
            }
        }
    }

}
