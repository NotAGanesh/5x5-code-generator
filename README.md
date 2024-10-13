### ⚡️ Simple and fast 5x5 Codes Generator
there are two method to grant codes i personally use python method but you can use website or other computer language codes.
- [Code Generator Website](https://notaganesh.github.io/5x5-code-generator/)

### 🤔 How the code works?
- the code is very similar from Microsoft Redeem codes/Minecraft Redeem.
- the code generate 5x5 like this `XXXXX-XXXXX-XXXXX-XXXXX-XXXXX` total 25 digits.
- the code does not contain`A, E, I, O, U, L, S, 0, 1 and 5`.
- the code ends with `Z` (i.g R9VGR-F8GWP-4V7NW-273B7-VTT6Z).
- the code does not repeat same character once like this `XXXXX-XXXXX-XXTTT-XXXXX-XXXXX`
- the generated code must be in capital letters
 

Use this Python code or other language codes are in main branch of repo. <alt>↓</alt>
```
import random

def generate_code(num_codes=25, max_repeats=2):
    allowed = "2346789BCDFGHJKMNPQRTVWXYZ"
    codes = set()
    while len(codes) < num_codes:
        code = "-".join("".join(random.choices(allowed, k=5)) for _ in range(4)) + "-" + "".join(random.choices(allowed, k=4)) + "Z"
        if not any(code.count(char) > max_repeats for char in allowed):
            codes.add(code)
    return list(codes)
num_codes = 25
max_repeats = 2  
generated_codes = generate_code(num_codes, max_repeats)
for code in generated_codes:
    print(code)

```
  - (here are some compilers on web i.g) [Programiz Python Code Compiler](https://www.programiz.com/python-programming/online-compiler/)  

> [!NOTE]  
> The source code generated using **ChatGPT, Gemini**. mistakes can there. i'll improve the code in future!
