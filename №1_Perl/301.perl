my @urls = ();
my $wasNotEmptyString = "false";
my $needPrintEmpty = "false";
while (<>) {
    if (/^(\s*)$/) {
        if($wasNotEmptyString eq "true") {
            $needPrintEmpty = "true";
        }
    } else {
        if ($needPrintEmpty eq "true") {
            print "\n";
            $needPrintEmpty = "false";
        }
        s/^(\s+)(.+?)(\s+)$/$2/;
        s/(\s+)/ /g;
        s/^(.*?)(\s*)$/$1/;
        print;
        print "\n";
        $wasNotEmptyString = "true";
    }
}

