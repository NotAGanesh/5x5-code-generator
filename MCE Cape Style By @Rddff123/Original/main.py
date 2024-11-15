import random

def generate_code(num_codes=25):
    """Generates a list of unique codes based on the specified format.

    Args:
        num_codes: The desired number of unique codes.

    Returns:
        A list of unique codes.
    """

    allowed_chars = "2346789BCDFGHJKMNPQRTVWXYZ"
    codes = []

    while len(codes) < num_codes:
        code = "2" + "".join(random.choices(allowed_chars, k=4)) + "-" + \
               "-".join("".join(random.choices(allowed_chars, k=5)) for _ in range(3)) + "-" + \
               "".join(random.choices(allowed_chars, k=4)) + "Z"

        if not any(code[i:i+3] == code[i+3:i+6] for i in range(len(code) - 6)):
            codes.append(code)

    return codes

# Generate and print 25 unique codes
for code in generate_code():
    print(code)