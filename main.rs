use rand::Rng;

fn generate_code() -> Vec<String> {
    let allowed_chars = "2346789BCDFGHJKMNPQRTVWXYZ";
    let mut codes = Vec::new();

    while codes.len() < 25 {
        let mut code_parts = Vec::new();

        // Generate the first four parts with 5 characters each
        for _ in 0..4 {
            let part: String = (0..5)
                .map(|_| {
                    let idx = rand::thread_rng().gen_range(0..allowed_chars.len());
                    allowed_chars.chars().nth(idx).unwrap()
                })
                .collect();
            code_parts.push(part);
        }

        // Generate the last part with 4 characters and append 'Z'
        let last_part: String = (0..4)
            .map(|_| {
                let idx = rand::thread_rng().gen_range(0..allowed_chars.len());
                allowed_chars.chars().nth(idx).unwrap()
            })
            .collect::<String>() + "Z";

        // Combine parts into a full code
        let code = code_parts.join("-") + "-" + &last_part;

        // Check for three consecutive repeated characters
        let mut valid = true;
        for i in 0..(code.len() - 6) {
            if &code[i..i + 3] == &code[i + 3..i + 6] {
                valid = false;
                break;
            }
        }

        // If valid, add to the list of codes
        if valid {
            codes.push(code);
        }
    }

    codes
}

fn main() {
    // Generate and print 25 codes
    let codes = generate_code();
    for code in codes {
        println!("{}", code);
    }
}
