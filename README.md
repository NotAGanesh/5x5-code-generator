### 5x5 Codes Generator
there are two method to grant codes i personally use python method but you can use website or other computer language codes.
- [Code Generator Website](https://notaganesh.github.io/5x5-code-generator/)

### How the code works?
- the code is very similar from Microsoft Redeem codes.
- the code generate 5x5 like this `XXXXX-XXXXX-XXXXX-XXXXX-XXXXX` total 25 digits.
- the code does not contain`A, E, I, O, U, L, S, 0, 1 and 5`.
- the code ends with `Z` (i.g R9VGR-F8GWP-4V7NW-273B7-VTT6Z)

Use this code <alt>↓</alt>
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

