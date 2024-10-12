<?php
function generate_code() {
    $allowed_chars = "2346789BCDFGHJKMNPQRTVWXYZ";
    $codes = [];

    for ($i = 0; $i < 25; $i++) {  // Generate 25 codes
        $code = implode("-", array_map(function() use ($allowed_chars) {
            return substr(str_shuffle(str_repeat($allowed_chars, 5)), 0, 5);
        }, range(1, 4))) . "-" . substr(str_shuffle(str_repeat($allowed_chars, 4)), 0, 4) . "Z";
        $codes[] = $code;
    }

    return $codes;
}

// Generate and print 25 codes
foreach (generate_code() as $code) {
    echo $code . "\n";
}
?>

