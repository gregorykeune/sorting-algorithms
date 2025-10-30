# Sorting Algorithms Performance

Este projeto compara o desempenho de diferentes algoritmos de ordenação (sorting) implementados em Java.  
Foram testadas três variações de cada algoritmo, e medidos dois critérios principais:

- **Trocas** → Quantidade de vezes que elementos foram trocados.
- **Repetições** → Quantidade de iterações (passagens em laços).

---

## Resultados gerais

### Bubble Sort
| Vetor | Trocas | Repetições |
|:--------|:-------:|:-----------:|
| v1 | 78 | 194 |
| v2 | 0 | 19 |
| v3 | 190 | 209 |

---

### Selection Sort
| Vetor | Trocas | Repetições |
|:--------|:-------:|:-----------:|
| v1 | 18 | 210 |
| v2 | 0 | 210 |
| v3 | 10 | 210 |

---

### Cocktail Sort
| Vetor | Trocas | Repetições |
|:--------|:-------:|:-----------:|
| v1 | 78 | 168 |
| v2 | 0 | 38 |
| v3 | 190 | 200 |

---

### Comb Sort
| Vetor | Trocas | Repetições |
|:--------|:-------:|:-----------:|
| v1 | 27 | 126 |
| v2 | 0 | 126 |
| v3 | 16 | 126 |

---

### Gnome Sort
| Vetor | Trocas | Repetições |
|:--------|:-------:|:-----------:|
| v1 | 78 | 174 |
| v2 | 0 | 19 |
| v3 | 190 | 380 |

---

### Bucket Sort
| Vetor | Trocas | Repetições |
|:--------|:-------:|:-----------:|
| v1 | 42 | 141 |
| v2 | 40 | 141 |
| v3 | 44 | 159 |

---

## Rankings

### **Menor número de trocas**
| Posição | Algoritmo | Média de Trocas |
|----------|------------|------------------|
| 1 | **Selection Sort** | 9.3 |
| 2 | **Comb Sort** | 14.3 |
| 3 | **Bucket Sort** | 42.0 |
| 4️ | **Bubble Sort** | 89.3 |
| 4️ | **Cocktail Sort** | 89.3 |
| 4️ | **Gnome Sort** | 89.3 |

**Conclusão:**  
O **Selection Sort** foi o algoritmo com **menos trocas**, seguido de perto pelo **Comb Sort**.


---

### **Menor número de repetições (mais eficiente em laços)**
| Posição | Algoritmo | Média de Repetições |
|----------|------------|----------------------|
| 1 | **Comb Sort** | 126.0 |
| 2 | **Cocktail Sort** | 135.3 |
| 3 | **Bubble Sort** | 140.7 |
| 4️ | **Bucket Sort** | 147.0 |
| 5️ | **Gnome Sort** | 191.0 |
| 6️ | **Selection Sort** | 210.0 |

**Conclusão:**  
O **Comb Sort** teve o **menor número médio de iterações**, sendo o mais rápido entre os algoritmos testados.


---

## Conclusão Geral

| Critério | Melhor Algoritmo |
|-----------|------------------|
| **Menos trocas (eficiência na movimentação)** | **Selection Sort** |
| **Menos repetições (eficiência em tempo)** | **Comb Sort** |

**Insight:**  
O **Selection Sort** é eficiente em termos de movimentação de elementos (baixo número de trocas),  
mas o **Comb Sort** se destaca em velocidade, com o menor número médio de iterações.
No geral o **Comb Sort** foi o que mais se destacou, tendo um desempenho sólido nas duas métricas avaliadas (trocas e repetições).

