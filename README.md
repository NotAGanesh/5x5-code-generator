### ⚡️ Simple and fast 5x5 Codes Generator
there are two method to grant codes i personally use python method but you can use website or other computer language codes.
- [Code Generator Website](https://notaganesh.github.io/5x5-code-generator/)

### 🤔 How Does the Code Work?

- The code generates a pattern similar to Microsoft or Minecraft redeem codes.
- Format: `XXXXX-XXXXX-XXXXX-XXXXX-XXXXX` (5 groups of 5 characters / 5x5 digits).
- The code excludes: `A, E, I, O, U, L, S, 0, 1, and 5`.
- It always ends with `Z` (e.g., `R9VGR-F8GWP-4V7NW-273B7-VTT6Z`).
- Rarely, the same character may repeat consecutively, like `XXXXX-XXXXX-XXTTT-XXXXX-XXXXX`.
- The generated code consists entirely of uppercase letters.

 

Use this Python code or other language codes are in main branch of repo. <alt>↓</alt>
```
import random

def generate_code():
    allowed_chars = "2346789BCDFGHJKMNPQRTVWXYZ"
    codes = []

    for _ in range(25):  # Generate 25 codes
        code = "-".join(
            "".join(random.choices(allowed_chars, k=5)) for _ in range(4)
        ) + "-" + "".join(random.choices(allowed_chars, k=4)) + "Z"
        codes.append(code)

    return codes

# Generate and print 25 codes
for code in generate_code():
    print(code)

```
  - (here are some compilers on web i.g) [Programiz Python Code Compiler](https://www.programiz.com/python-programming/online-compiler/)  

> [!NOTE]  
> The source code generated using **ChatGPT, Gemini**. mistakes can there. i'll improve the code in future!
