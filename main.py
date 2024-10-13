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
