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
