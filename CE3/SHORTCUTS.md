# ⚡ HashSet & TreeSet — Ultimate Exam Shortcut Sheet

---

## 🟢 1. HashSet Shortcut Methods

### 🔹 `add()` — Add & Duplicate Detection
`add()` returns a `boolean`:
- `true` $\rightarrow$ Element was added (new element)
- `false` $\rightarrow$ Element already existed (duplicate!)

```java
// Fast duplicate detection
if (!set.add(num)) {
    System.out.println("Duplicate Found");
}
```

### 🔹 `size()` — Count Unique Elements
```java
HashSet<Integer> a = new HashSet<>();
a.add(10); a.add(20); a.add(10); a.add(30);
System.out.println(a.size()); // Output: 3 (10, 20, 30)
```

### 🔹 `contains()` — Check Existence
```java
if (b.contains(num)) {
    System.out.print(num + " "); // num is in both sets
}
```

---

## 🔥 2. Set Operations (Union, Difference, Intersection)

| Operation | Concept | Method | Mathematical Notation |
|---|---|---|---|
| **UNION** | All distinct elements from both sets | `a.addAll(b);` | $A \cup B$ |
| **COMMON** | Elements present in both sets | `a.retainAll(b);` | $A \cap B$ |
| **DIFFERENCE** | Elements in $A$ but NOT in $B$ | `a.removeAll(b);` | $A - B$ |

### 💡 Code Examples:

```java
HashSet<Integer> A = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
HashSet<Integer> B = new HashSet<>(Arrays.asList(20, 40, 60));

// 1. UNION (A U B)
HashSet<Integer> union = new HashSet<>(A);
union.addAll(B);
// Result: [10, 20, 30, 40, 50, 60]

// 2. COMMON / INTERSECTION (A ∩ B)
HashSet<Integer> common = new HashSet<>(A);
common.retainAll(B);
// Result: [20, 40]

// 3. DIFFERENCE (A - B)
HashSet<Integer> diff = new HashSet<>(A);
diff.removeAll(B);
// Result: [10, 30, 50]
```

---

## 🌳 3. TreeSet Navigation Shortcuts

Given `TreeSet` = `{10, 20, 30, 40, 50}` and `x = 30`:

| Method | Definition | Condition | Result (`x = 30`) | If `x = 35` |
|---|---|---|---|---|
| `first()` | Smallest element | Smallest | `10` | `10` |
| `last()` | Largest element | Largest | `50` | `50` |
| `higher(x)` | Strictly greater | $> x$ | `40` | `40` |
| `lower(x)` | Strictly smaller | $< x$ | `20` | `30` |
| `ceiling(x)` | $x$ or next greater | $\ge x$ | `30` | `40` |
| `floor(x)` | $x$ or previous smaller | $\le x$ | `30` | `30` |

### 🧠 Easy Memory Rules:
- **`higher(x)`** $\rightarrow$ strictly UP ⬆️ ($> x$)
- **`lower(x)`** $\rightarrow$ strictly DOWN ⬇️ ($< x$)
- **`ceiling(x)`** $\rightarrow$ allowed to equal $x$ ($\ge x$)
- **`floor(x)`** $\rightarrow$ allowed to equal $x$ ($\le x$)

> ⚠️ **Note:** If no such element exists (e.g. `higher(50)` on `{10, 20, 30, 40, 50}`), it returns `null`.

### 🔹 Sorted Range (`subSet`)
```java
TreeSet<Integer> a = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));

// Excludes 50: [20, 30, 40]
System.out.println(a.subSet(20, 50));

// Includes both bounds: [20, 30, 40, 50]
System.out.println(a.subSet(20, true, 50, true));
```

---

## 📌 4. Summary Quick Reference

```
                   SET
                    │
        ┌───────────┴───────────┐
        │                       │
     HashSet                 TreeSet
        │                       │
     UNIQUE                  UNIQUE
        +                       +
 NO guaranteed order         SORTED
```

### Top 10 Exam Methods to Memorize:
1. `add(x)` $\rightarrow$ returns `false` on duplicate
2. `size()` $\rightarrow$ total unique elements
3. `contains(x)` $\rightarrow$ check presence
4. `addAll(b)` $\rightarrow$ Union ($A \cup B$)
5. `retainAll(b)` $\rightarrow$ Common elements ($A \cap B$)
6. `removeAll(b)` $\rightarrow$ Difference ($A - B$)
7. `first()` / `last()` $\rightarrow$ Min / Max in `TreeSet`
8. `higher(x)` / `lower(x)` $\rightarrow$ Strictly $> x$ / $< x$
9. `ceiling(x)` / `floor(x)` $\rightarrow$ $\ge x$ / $\le x$
10. `isEmpty()` / `clear()` $\rightarrow$ check empty / wipe all
