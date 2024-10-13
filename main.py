import random

def generate_code():
    allowed_chars = "2346789BCDFGHJKMNPQRTVWXYZ"
    codes = []

    while len(codes) < 25:  # Generate 25 codes
        code = "-".join(
            "".join(random.choices(allowed_chars, k=5)) for _ in range(4)
        ) + "-" + "".join(random.choices(allowed_chars, k=4)) + "Z"

        # Check for three consecutive repeated characters
        if all(code[i:i+3] != code[i+3:i+6] for i in range(len(code) - 6)):
            codes.append(code)

    return codes

# Generate and print 25 codes
for code in generate_code():
    print(code)
