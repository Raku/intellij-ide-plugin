package edument.perl6idea.psi.effects;

import com.intellij.util.containers.ContainerUtil;

import java.util.HashSet;
import java.util.Set;

public class EffectCollection {
    public static final EffectCollection EMPTY = of();

    private final Set<Effect> effects = new HashSet<>();

    private EffectCollection(Set<Effect> effects) {
        this.effects.addAll(effects);
    }

    public EffectCollection handle(Effect effect) {
        HashSet<Effect> newEffects = new HashSet<>(effects);
        newEffects.remove(effect);
        return new EffectCollection(newEffects);
    }

    public static EffectCollection of(Effect... effects) {
        return new EffectCollection(ContainerUtil.set(effects));
    }

    public EffectCollection with(Effect... effects) {
      return merge(new EffectCollection(ContainerUtil.set(effects)));
    }

    public EffectCollection merge(EffectCollection other) {
        HashSet<Effect> effects = new HashSet<>();
        effects.addAll(this.effects);
        effects.addAll(other.effects);
        return new EffectCollection(effects);
    }

    public boolean is(Effect effect) {
        return effects.contains(effect);
    }
}
