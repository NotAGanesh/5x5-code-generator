use rand::seq::SliceRandom; // Make sure this is included
use rand::thread_rng;
use std::collections::HashSet;

fn generate_code() -> Vec<String> {
    let allowed_chars: Vec<char> = "2346789BCDFGHJKMNPQRTVWXYZ".chars().collect(); // Convert to Vec<char>
    let mut codes: HashSet<String> = HashSet::new();
    let mut rng = thread_rng();

    while codes.len() < 25 {
        // Generate the first four segments
        let segments: Vec<String> = (0..4)
            .map(|_| {
                (0..5)
                    .map(|_| allowed_chars.choose(&mut rng).expect("Failed to choose character")) // Ensure allowed_chars is a Vec<char>
                    .collect::<String>()
            })
            .collect();

        // Generate the final segment
        let final_segment: String = (0..4)
            .map(|_| allowed_chars.choose(&mut rng).expect("Failed to choose character"))
            .collect();

        // Construct the full code
        let code = format!("{}-{}-{}-{}-{}Z", 
            segments[0], segments[1], segments[2], segments[3], final_segment);

        // Insert the generated code into the HashSet
        codes.insert(code);
    }

    codes.into_iter().collect()
}

fn main() {
    for code in generate_code() {
        println!("{}", code);
    }
}
