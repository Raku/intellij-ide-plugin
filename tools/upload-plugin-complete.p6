sub MAIN($version) {
    run 'gsutil', 'cp', "../out/commaCP/artifacts/CP-plugins/comma-$version.zip",
        "gs://comma-downloads/comma-cp-plugin-$version.zip";
}
