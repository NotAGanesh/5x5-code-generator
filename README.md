### 5x5 Codes Generator
there are two method to grant codes i personally use python method but you can use website.
- [Code Generator Website](https://notaganesh.github.io/5x5-code-generator/)
use this code
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

