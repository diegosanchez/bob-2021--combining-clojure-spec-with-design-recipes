## Workshop

## IMPORTANT

**The _main_ branch may suffer changes. Likely, you will need to performe `git pull -r`. We let you know it during the workshop**

### Prerequisites

- An [github][external-github] account.
- [Git][external-git] installed.
- [Clojure 1.10.2 + the Clojure CLI tools][external-clojure-installation] installed.
- Your favourite IDE already set up. [Editor as IDE][external-clojure-editor-as-ide].

### Get ready for the activity

#### Clone the repository

```bash
git clone git@github.com:diegosanchez/bob-2021--combining-clojure-spec-with-design-recipes.git bob-2021
```

#### Change directory

```bash
cd bob-2021
```
#### Run test (verification)

```bash
clojure -M:test:runner
```

Expected output:

```
Running tests in #{"test"}

Testing ws.prepaid-test

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.
```

#### Invoke library (verification)

```bash
    clojure -X:use-case
```

Expected output:

```
Entry point for testing the use case from CLI...
Args: {:key-simple 1, :key-map-value {:v1 "a", :v2 "b"}}
Calling use case...
1 {:v1 "a", :v2 "b"}
```

### Helpful tasks

Some common tasks below.

| Task               | Command                                         |
|--------------------|-------------------------------------------------|
| Run all tests      | `clojure -M:test:runner`                        |
| Run unstable tests | `clojure -M:test:runner -i, --include unstable` |
| Run stable tests   | `clojure -M:test:runner -e, --exclude unstable` |
| Run the use case   | `clojure -X:use-case`                           |

[external-clojure-installation]: https://clojure.org/guides/getting_started
[external-clojure-editor-as-ide]: https://clojure.org/community/tools
[external-clojure-toolbox]: https://betweentwoparens.com/what-are-the-clojure-tools
[external-git]: https://git-scm.com/doc
[external-github]: https://github.com/
[external-github-fork]: https://guides.github.com/activities/forking/
[external-bob]: https://bobkonf.de/2021/sanchez-doctors.html
[external-test-runner]: https://github.com/cognitect-labs/test-runner
