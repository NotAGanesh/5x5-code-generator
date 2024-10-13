<?php

function generate_code() {
    $allowed_chars = "2346789BCDFGHJKMNPQRTVWXYZ";
    $codes = array();

    while (count($codes) < 25) {  // Generate 25 codes
        $code_parts = array();

        // Generate the first four parts with 5 characters each
        for ($i = 0; $i < 4; $i++) {
            $part = '';
            for ($j = 0; $j < 5; $j++) {
                $part .= $allowed_chars[random_int(0, strlen($allowed_chars) - 1)];
            }
            $code_parts[] = $part;
        }

        // Generate the last part with 4 characters and append 'Z'
        $last_part = '';
        for ($j = 0; $j < 4; $j++) {
            $last_part .= $allowed_chars[random_int(0, strlen($allowed_chars) - 1)];
        }
        $last_part .= 'Z';

        // Join all parts together
        $code = implode("-", $code_parts) . "-" . $last_part;

        // Check for three consecutive repeated characters
        $valid = true;
        for ($i = 0; $i < strlen($code) - 6; $i++) {
            if (substr($code, $i, 3) == substr($code, $i + 3, 3)) {
                $valid = false;
                break;
            }
        }

        // If valid, add to the list of codes
        if ($valid) {
            $codes[] = $code;
        }
    }

    return $codes;
}

// Generate and print 25 codes
$codes = generate_code();
foreach ($codes as $code) {
    echo $code . "\n";
}

?>
